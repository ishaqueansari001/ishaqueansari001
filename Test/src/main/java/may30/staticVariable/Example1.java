package may30.staticVariable;

public class Example1 {

	public static void main(String[] args) {
//		A1 object1=new A1();
// here no needs  of create any object to access any static method because with the help of class we can access the static method&variable		
		B2.method1();

	}

}

//print static variable of one class to  instance method of other class

class A1 {

	static int musab = 10;

}

class B2 {
// if variable is static then we have to create method also static
	public static void method1() {

		System.out.println("What is the age of musab= "+A1.musab);

	}

}