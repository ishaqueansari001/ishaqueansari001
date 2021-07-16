package A_GfG_While_loop;

public class While1_Loop {
	public static void main(String[] args) {
		int x = 1, sum = 0;
		while (x <= 10) {

			sum = sum + x;
			x++;
			System.out.print("value of sum is= " + sum + "\t");
			System.out.println("value of x is= " + x);
		}
		System.out.println("Sumation of X*sum = " + sum);

	}
}