package B_GfG_Array_in_java;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Sir please enter your name : ");
		String firstname = input.next();

		System.out.println("sir please provid your last name : ");
		String lastname = input.next();

		System.out.println("how age are you: ");
		String age = input.next();

		System.out.println("Where you form?");
		String add = input.next();

		System.out.println("your full name is : " + firstname + " " + lastname + " " + age + "(Year)");
		System.out.println("And He is from :\t" + add);
		System.out.println("...Ok sir Have a nice day");

	}

}
