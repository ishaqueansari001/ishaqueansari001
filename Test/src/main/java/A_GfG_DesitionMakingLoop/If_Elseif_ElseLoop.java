package A_GfG_DesitionMakingLoop;

public class If_Elseif_ElseLoop {
	public static void main(String[] args) {

		int x = 22;
		if (x == 10)// we can't use equal operator (x = _)
		{
			System.out.println("x is 10");
		} else if (x == 11) {
			System.out.println("x is 11");
		} else if (x < 20)// here x is less then 20 whenever we put int x = 19,18,17..etc it will print
		// (x is 20)
		{
			System.out.println("x is less then < 20");
		} else if (x == 21) {
			System.out.println("x is = 21");
		} else {
			System.out.println("x is not here");
		}
	}

}
