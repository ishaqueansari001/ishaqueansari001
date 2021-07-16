package A_GfG_For_loop;

class For_Loop {
	public static void main(String[] args) {

		for (int x = 0; x <= 3; x++) {

			System.out.print("value of x= " + x + "\t");
		}
		System.out.println();
//
		int sum = 0;
		for (int x = 0; x < 10; x++) {
			System.out.print("helo" + x + "\t");
			sum = sum + x;
		}
		System.out.println("total is= " + sum);
		System.out.println();
//
		int value = 1;

		int[] rollno = new int[50];
		for (int x = 0; x < rollno.length; x++) {
			System.out.print("x= " + x + ", ");

//  for assigning value to the index is, firstly take variable out side the loop
			rollno[x] = value;
			value = value + 1;
			System.out.println("rollno = " + rollno[x]);
		}
//  HERE WE ARE PRINTING ONLY ROLLNO of 10 position
		System.out.println("ROLLNO [10]= " + rollno[10]);

	}
}
