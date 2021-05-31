package may30.instancevariable;

public class Example2 {

	public static void main(String[] args) {
		B2 salman = new B2();
		salman.m2();

	}

}

//print instance variable of one classA to  instance method of another classB

class A2 {

	int a2 = 10;

}

class B2 {

	public void m2() {
		A2 object2 = new A2();
		System.out.println("this is A2: " + object2.a2);

	}

}