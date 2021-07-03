package A_GfG_DesitionMakingLoop;

public class Continue_loop {

	public static void main(String[] args) {
		int i = 0;
		for (i = 0; i < 100; i++) {

			if (i % 2 == 0) {
				if (i >= 50)
					break;
				continue;
			}
			System.out.println("printing all odd no" + i);
//		i have a doubt, if i want to skip i=0
//		what can i do
		}
		System.out.println("total no is\t" + i);

	}

}
