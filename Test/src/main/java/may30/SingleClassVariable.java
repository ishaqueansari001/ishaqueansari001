package may30;

public class SingleClassVariable {

	int i = 10;
	static SingleClassVariable s = new SingleClassVariable();

	public static void main(String[] args) {

		// System.out.println("am i" + i);
	}

	public void m1() {
		// within the class a instance variable can be directly used inside
		// a instance menthod( it uses this reference)
		System.out.println("Printing instance variable i" + i);
	}

	public static void m2() {
		// within a class instance variable can not be accessed in
		// static method directly
		// compulsury we need a class object to access instance varialbe.

		// System.out.println("Printing instance variable i"+ i);

		System.out.println(" Printing instance variable from static method using object" + s.i);
	}

}
