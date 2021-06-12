package june10.flowcontrol;

public class FlowControl {

	public static void main(String[] args) {
		int x = 0;
//		int x=1;
//		int x=2;
//		int x=3;
//		int x=4;
//		when we initialize x then flow start form case 0 to down word side till break operator and close curlly brases

		switch (x) {
		case 0:
			System.out.println("Value of case 0= " + 0);

		case 1:
			System.out.println("value of case 1= " + 1);
			break;
//when we pass break operator the flow throws form here and go out form curlly brases 
		case 2:
			System.out.println("value of case 1= " + 2);

		case 3:
			System.out.println("value of case 1= " + 3);
		default:
			System.out.println("def value=");
//		if no case matched default case executed 
//			and only one default case will  available here

//			with in the switch we can take at most one default case
//			default case will be executed if only if there is no case matched
//			within a switch we can write any ware but recommended to write last case

		}
	}
}
