package A_GfG_DesitionMakingLoop;

public class If_else_loop {

	public static void main(String[] args) {
		int x = 20;
		if (x == 20)// we can use (x==_)or(x > _)or(x < _)or(x<=_) but we can't use (x=_) w'll get
					// C.E
		{ // here we can also used nested loop also
			if (x == 20)
				System.out.println("again true");
			System.out.println("its true");
		} // it means that we can give the body or block to it
		else
			System.out.println("its false");
		System.out.println();

		double d = 123d;
		if (d < 124)
			System.out.println("true double");
		else
			System.out.println("false double");
		System.out.println();

		long l = 123;
		System.out.println("Long l= " + l);
		if (l < 122)
			System.out.println("its a value of Long " + "true long");
		else
			System.out.println("its a value of Long " + "false long");

		System.out.println();
		System.out.println("Boolean Eg");
		boolean b = true;
		boolean c = false;
		if (b == true) {
			if (c == false) {
				System.out.println("b staticfy true and c staticfy false");
			}
		} else
			System.out.println("B is true");
	}

}
