package may30.staticVariable;

public class Example2 {

	public static void main(String[] args) {
		OlivetreeGirls.m2();
	}

}

//print static variable of one class to  static method of another class

class Olivetree {
	// Olivetree-->school"
	static int male = 10;

}

class OlivetreeGirls {

	public static void m2() {
		System.out.println("Here total number of male candidates is= " + Olivetree.male);
	}

}