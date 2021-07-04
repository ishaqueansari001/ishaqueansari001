package A_GfG_Java_in_loop;

public class Enhanced_forlLoop
//	its also called as each for loop

{
	public static void main(String[] args) {
		int[] rollno = new int[100];
//	here compilier assign default value is 0
		System.out.println(rollno[10]);

//		know am going to assign rollno all index by using each for loop
		int con = 0;
		for (int x = 0; x < 10; x++) {
			rollno[x] = con;
			con = con + 1;

			System.out.println("rollno = " + rollno[x] + "CON VALUE IS= " + con);
		}

		System.out.println("roll [5]= " + rollno[5]);

		System.out.println();

//	doubt
//		can we assign all index by using each for loop/enhanced loop
		int[] rollno1 = new int[10];
		int temp = 0;
		for (int x : rollno1) {
			rollno1[x] = temp;
			temp = temp + 1;
			System.out.println("rollno1 is " + rollno1[x]);
		}
		System.out.println("rollno1 [2]=" + rollno1[2]);
		System.out.println("rollno1 [1]=" + rollno1[1]);

//		
		String[] s = { "salman", "Bob", "rose", "inamdar", "hello" };

		for (String a : s) {
			System.out.println("string [] " + a);

		}

	}

}
