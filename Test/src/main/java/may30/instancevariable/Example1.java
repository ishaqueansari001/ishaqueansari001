package may30.instancevariable;

public class Example1 {

	public static void main(String[] args) {
		A1 object1 = new A1();
		object1.m1();
		

	}
}

//print instance variable of one class to  instance method of same class

class A1 {

	int a1 = 50;

	public void m1() {
		System.out.println("a1= " + a1);
	}

}