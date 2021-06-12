package june12.homepc.arraypractice;

public class ReversArray {

	public static void main(String[] args) {

		int[] revers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("The orignal array value is :");
		for (int x = 0; x < revers.length; x++) {

			System.out.print(revers[x] + " ");
		}

		System.out.println("\n\nThe Revers array value is :");
		for (int x1 = revers.length - 1; x1 >= 0; x1--) {
			System.out.print(revers[x1] + " ");

		}

	}

}
