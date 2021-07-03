package A_GfG_DesitionMakingLoop;

public class Loop_break {

	public static void main(String[] args) {
		// Initially loop is set to run from 0-9
		for (int i = 0; i < 10; i++) {

			// but here loop will terminated on 5
			if (i == 6)
				break;
			System.out.println("inside of the loop " + i);
		}
		System.out.println("loop completed");
	}

}
