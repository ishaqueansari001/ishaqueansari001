package may30.staticVariable;

public class Example4 {

	public static void main(String[] args) {
		Chanllenge.m4();
	}
}
//print static  variable of one class to  static method of same class

class Chanllenge {
	static String salman = "YES or NO";

	public static void m4() {
		System.out.println("Will be salman proficiency in JAVA =  " + Chanllenge.salman);

	}

}