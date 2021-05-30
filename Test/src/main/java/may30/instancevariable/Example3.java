package may30.instancevariable;

public class Example3 {
	public static void main(String[] args) {
		A3.m3();

	}
 
}

//print instance variable inside static method within the same class

class A3 {
 
	int a3 = 10;

	public static void m3() {
		A3 object3 = new A3();
		System.out.println("this is class A3 instance variable a3= " + object3.a3);

	}

}