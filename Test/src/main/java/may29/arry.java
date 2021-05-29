package may29;

public class arry {

	// intilizing 5 elmt in an array using extrnal veriabl A
	public static void main(String[] args) {
		int a = 1;
		int[] boys = new int[5];
		for (int i = 0; i < 5; i++) {

			boys[i] = a;
			a++;
			System.out.println(boys[i]);

		}

		for (int i = 0; i < boys.length; i++) {
		}

	}

}
