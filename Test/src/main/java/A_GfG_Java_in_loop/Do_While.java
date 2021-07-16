package A_GfG_Java_in_loop;

public class Do_While {
	public static void main(String[] args) {

		int a = 200;
		do {// body/statement of do loop
			System.out.println("value of a ia= " + a);
			a++;
		}

//	jub tak a ki value 205 nihi hojati statement/boy exicute karte raho
		while (a <= 205);

		int x=0;
		do {
			System.out.println("value of x is= "+ x);
			x++;
		}
		while (x<=5);//		HERE WE CANT USED == OPERATOR BECAUSE X VALUE IS 0==5 is not a correct statement
	}

}
