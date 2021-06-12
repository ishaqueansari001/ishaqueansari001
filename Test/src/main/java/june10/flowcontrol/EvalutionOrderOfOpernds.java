package june10.flowcontrol;

public class EvalutionOrderOfOpernds {

	public static void main(String[] args) {

//there is no precidence for oprends  only precedency for operator(+-*/etc)
		System.out.println(m1(1) + m1(2) * m1(3) / m1(4) + m1(5) * m1(6));
	}

	public static int m1(int i) {
//here we are returning int value thats way here we didn't used void
		System.out.println(i);
		return i;

	}

}
