package june12.homepc.arraypractice;

public class ArrayByUsingloop {
	public static void main(String[] args) {
//	declaration of an array
		int[] salman;

//	Construction of an array But at a time of construction of array we should have to specify the size of an array
		salman = new int[5];

		// initialization of tha array
		salman[0] = 10;
		salman[1] = 20;
		salman[2] = 30;
		salman[3] = 40;
		salman[4] = 50;
		System.out.println(salman[1]);

// in single line construction, initialization, declaration, of an array
		int[] salman1 = { 10, 20, 30, 40, 50 };
		System.out.println(salman1[2]);
//		to print a length of array
		System.out.println("length of array \t" + salman1.length);

		for (int x = 0; x < salman1.length; x++) {
//			to print a position of a array element/index
			System.out.println("\nposition of array element\t" + x);
//			to print value in index or element is 
			System.out.println("\nvalue in index is \t" + salman1[x]);

		}

	}

}
