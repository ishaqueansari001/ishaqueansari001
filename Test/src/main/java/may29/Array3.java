package may29;

public class Array3 {
	public static void main(String[] args) {
		int a = 1;
		int[] boys = new int[5];
		for (int i = 0; i < 5; i++) {
			boys[i] = a;
			a++;

		}

		for (int i = 0; i < boys.length; i++) {
			System.out.println(boys[i]);
		}
	}
}
