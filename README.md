- 👋 Hi, I’m @ishaqueansari001
- 👀 I’m interested in ...
- 🌱 I’m currently learning ...
- 💞️ I’m looking to collaborate on ...
- 📫 How to reach me ...

<!---
ishaqueansari001/ishaqueansari001 is a ✨ special ✨ repository because its `README.md` (this file) appears on your GitHub profile.
You can click the Preview link to take a look at your changes.
--->


import graphql.language.StringValue;
import graphql.schema.Coercing;
import graphql.schema.GraphQLScalarType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

public class DateScalarTest {

    private GraphQLScalarType dateScalar;
    private Coercing<?, ?> coercing;

    @BeforeEach
    public void setUp() {
        dateScalar = GraphQLScalarType.newScalar()
                .name("Date")
                .description("A custom scalar to handle ISO date formats")
                .coercing(new Coercing<LocalDate, String>() {
                    private final DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE;

                    @Override
                    public String serialize(Object dataFetcherResult) {
                        if (dataFetcherResult instanceof LocalDate) {
                            return formatter.format((LocalDate) dataFetcherResult);
                        }
                        throw new IllegalArgumentException("Invalid date format");
                    }

                    @Override
                    public LocalDate parseValue(Object input) {
                        if (input instanceof String) {
                            return LocalDate.parse((String) input, formatter);
                        }
                        throw new IllegalArgumentException("Invalid date input");
                    }

                    @Override
                    public LocalDate parseLiteral(Object input) {
                        if (input instanceof StringValue) {
                            return LocalDate.parse(((StringValue) input).getValue(), formatter);
                        }
                        throw new IllegalArgumentException("Invalid date literal");
                    }
                })
                .build();

        coercing = dateScalar.getCoercing();
    }

    @Test
    public void testSerializeValidDate() {
        LocalDate date = LocalDate.of(2024, 11, 15);
        String result = coercing.serialize(date).toString();
        assertEquals("2024-11-15", result);
    }

    @Test
    public void testSerializeInvalidType() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> coercing.serialize("Invalid"));
        assertEquals("Invalid date format", exception.getMessage());
    }

    @Test
    public void testParseValueValidDate() {
        LocalDate result = (LocalDate) coercing.parseValue("2024-11-15");
        assertEquals(LocalDate.of(2024, 11, 15), result);
    }

    @Test
    public void testParseValueInvalidDate() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> coercing.parseValue("invalid-date"));
        assertEquals("Invalid date input", exception.getMessage());
    }

    @Test
    public void testParseLiteralValidDate() {
        StringValue stringValue = new StringValue("2024-11-15");
        LocalDate result = (LocalDate) coercing.parseLiteral(stringValue);
        assertEquals(LocalDate.of(2024, 11, 15), result);
    }

    @Test
    public void testParseLiteralInvalidDate() {
        StringValue stringValue = new StringValue("invalid-date");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> coercing.parseLiteral(stringValue));
        assertEquals("Invalid date literal", exception.getMessage());
    }
}
