package june12.homepc.arraypractice;

public class ArraySumation {
	public static void main(String[] args) {

		int[] maz = { 10, 20, 30, 40, 50 };
//	by using this command we can print only reference of maz object only 
		System.out.println(maz);
//	if we want to access the index value of array element
		System.out.println(maz[0]);

//	by using this we can do addition of all index element
		int add = 0;
		for (int x = 0; x < maz.length; x++) {

			add = add + maz[x];
			System.out.println("previous index value added in current index\t" + add);
		}
		System.out.println("\ntotal vale present in all index of maz array\t" + add);

	}

}

class TwoArraysAdition {
//if we write public here then it said tackle file name? will you plz solve it ishaque bhai
//	and can i add salman object value and maz object value together?

	public static void main(String[] args) {
		int[] salman = { 2, 3, 4, 5, 6, 7 };
		char[] maz = { 'a', 'i', 'o', 'u', 'e' };
		int add = 0;

		for (int x = 0; x < salman.length; x++) {

			add = add + salman[x];

		}
		System.out.println(add);
	}

}
