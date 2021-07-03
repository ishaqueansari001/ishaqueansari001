package A_GfG_DesitionMakingLoop;

public class NESTED_IF {

	public static void main(String[] args) {
		int x = 11;

		if (x == 11)// here double equal is compulsory in nested loop
		{
			if (x < 15)// condition check if its satisfy it'll print
				System.out.println("x is smaller then15");
			if (x < 12)// this condition also checked if it is also satisfied so also printed
				System.out.println("x is smaller then 12 too");
			if (x >= 10)// condition check if it is satisfy print it
				System.out.println("hello am nasted 10");
			if (x == 11)// condition check if it not satisfy leave it
				System.out.println("helooo am equal to 11");
			else //// .. Note if any one of the condition not satisfy then else condition will
					//// also print
				System.out.println("\t\t\t\t one of the If nasted loop not matched");

		}
//		if upward no one statement perfume then outside of if block will executed 

		else {
			if (x > 11)
				System.out.println("123");
			System.out.println("No one matched");
		}

	}

}
