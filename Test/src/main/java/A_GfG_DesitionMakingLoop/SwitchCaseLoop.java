package A_GfG_DesitionMakingLoop;

public class SwitchCaseLoop {
	public static void main(String[] args) {

		int i = 9;
		switch (i) {
		case 0:
			System.out.println("i is 0");
		break;
		case 1:
			System.out.println("i is 1");
			
		case 2:
			System.out.println("i is 2");
			
		case -4: // here we can assign -ve value also
			System.out.println("i is -4");
		

		default:
			System.out.println("i is greater then 3");
		}

	}

}
