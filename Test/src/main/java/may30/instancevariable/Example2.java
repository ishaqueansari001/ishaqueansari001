package may30.instancevariable;

public class Example2 {

	public static void main(String[] args) {

		B2 object2 = new B2();
		object2.method2();

	}
}

//call instance variable of one class to  instance method of another class

class A2 {

	int a2 = 10;

}

class B2 {

	public void method2() {
		A2 object1 = new A2();

		System.out.println("this is instance of class A2= ");
		System.out.println(object1.a2);
	}

}