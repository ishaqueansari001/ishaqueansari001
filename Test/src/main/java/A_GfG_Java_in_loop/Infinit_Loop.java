package A_GfG_Java_in_loop;

public class Infinit_Loop {
	public static void main(String[] args) {

		// infinite loop because condition is not correct
		// condition should have been i>0.
		for (int i = 5; i != 0; i -= 2) {
			System.out.println(i);
		}

		int x = 5;

		// infinite loop because update statement
		// is not provided.
		while (x == 5) {
			System.out.println("In the loop");
		}
	}
}

//import java.util.ArrayList;
//public class Integer1
//{
//    public static void main(String[] args)
//    {
//        ArrayList<Integer> ar = new ArrayList<>();
//        for (int i = 0; i < Integer.MAX_VALUE; i++)
//        {
//            ar.add(i);
//        }
//    }
//}
//Output:
//
//Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
//at java.util.Arrays.copyOf(Unknown Source)
//at java.util.Arrays.copyOf(Unknown Source)
//at java.util.ArrayList.grow(Unknown Source)
//at java.util.ArrayList.ensureCapacityInternal(Unknown Source)
//at java.util.ArrayList.add(Unknown Source)
//at article.Integer1.main(Integer1.java:9)
