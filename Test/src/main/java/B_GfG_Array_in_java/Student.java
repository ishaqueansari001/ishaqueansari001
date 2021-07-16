package B_GfG_Array_in_java;

import java.util.*;

public class Student {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Plz Enter Your First Name sir: ");
		String firstname = input.next();

		System.err.println("and your last name pleas: ");
		String lastname = input.next();

		System.out.println("and whats your age: ");
		String age = input.next();

		System.out.println("and where you from?");
		String add = input.next();

		System.out.println("Your Full Name is : " + firstname + " " + lastname + "\t" + age + "(YEAR)");
		System.out.println("& You Belong from \t" + add);
		System.out.println("...Ok sir Have a nice day");

	}

}
	