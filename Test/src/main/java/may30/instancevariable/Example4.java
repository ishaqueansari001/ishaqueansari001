package may30.instancevariable;

public class Example4 {
	public static void main(String[] args) {
		B4.m4();

	}

}
//print instance variable of one class to  static method of another class

class A4 {
	int a4 = 20;

}

class B4 {

	public static void m4() {

		A4 object4 = new A4();

		System.out.println("this is a instance variable of class A4= " + object4.a4);
	}

}