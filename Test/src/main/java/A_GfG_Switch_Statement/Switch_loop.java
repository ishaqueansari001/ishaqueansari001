package A_GfG_Switch_Statement;

public class Switch_loop {
	public static void main(String[] args) {
		int day = 5;
		String dayString;
		switch (day) {
		case 1:
			dayString = "MONDAY";
			break;
		case 2:
			dayString = "TUESDAY";
			break;
		case 3:
			dayString = "TUESDAY";
			break;
		case 4:
			dayString = "THUSDAY";
			break;
		case 5:
			dayString = "FRIDAY";
			break;
		case 6:
			dayString = "SATURDAY";
			break;
		case 7:
			dayString = "SUNDAY";
			break;
		default:
			dayString = "Invalid Day";

		}
		System.out.println("Int Day you inserted is= " + dayString);
	}

}

//	//switch statement 
//	switch(expression)
//	{
//	// case statements
//	// values must be of same type of expression
//	case value1 :
//   // Statements
//   break; // break is optional
//
//	case value2 :
//   // Statements
//   break; // break is optional
//
//	// We can have any number of case statements
//	// below is default statement, used when none of the cases is true. 
//	// No break is needed in the default case.
//	default : 
//   // Statements
//	}