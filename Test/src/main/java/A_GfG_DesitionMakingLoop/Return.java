package A_GfG_DesitionMakingLoop;

public class Return {
	public static void main(String[] args) {

		boolean b = true;
		System.out.println("befor return ");
		int a = 20;
		System.out.println("int a= " + a);
		int i = 10;
		System.out.println("int i= " + i);
		boolean m = true;
		System.out.println("m =" + m);

		if (m)
//		if m is true "hi" statement will not be display on console
			return;
		System.out.println("hi");
		System.out.println("hlllooo");
		System.out.println("HLOOO");
//		If m is false then "Hi " will be display on console and all the statement printed
	}

}
