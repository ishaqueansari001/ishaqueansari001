package A_GfG_Switch_Statement;

public class Switch2 {

	public static void main(String[] args) {
		int Day = 6;
		String dayString;
		String daytype;

		switch (Day) {
		case 1:

			dayString = "monday";
			break;
		case 2:
			dayString = "tuesday";
			break;
		case 3:
			dayString = "wednesday";

		case 4:
			dayString = "thusday";
			break;
		case 5:
			dayString = "friday";
			break;
		case 6:
			dayString = "saturday";
			break;
		case 7:
			dayString = "Sunday";
		default:
			dayString = "Invalid day";
		}

		switch (Day) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			daytype = "working day";
			break;
		case 6:
		case 7:
			daytype = "Holidays....";
			break;
		default:
			daytype = "Invalid week";

		}
		System.out.println("Today is a = " + dayString + "\t and What Kind of Week = " + daytype);
	}
}
