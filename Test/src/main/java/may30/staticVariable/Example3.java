package may30.staticVariable;

public class Example3 {
	public static void main(String[] args) {

		Salman$tusion.m3();
//if the variable is static then its compulsory to make method also static ok
	}

}

//print static variable inside instance method within the same class

class Salman$tusion {

	static int fee = 5000;

	public static void m3() {
		System.out.println("What's the tusion fees of salman= " + Salman$tusion.fee);
	}

}