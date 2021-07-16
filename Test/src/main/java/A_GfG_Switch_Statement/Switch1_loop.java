package A_GfG_Switch_Statement;

public class Switch1_loop {
	public static void main(String[] args) {

		int Day = 6;
		String daytype;
		String dayString;

		switch (Day) {
		case 1:
			dayString = "MONDAY";
			break;
		case 2:
			dayString = "Tuesday";
			break;
		case 3:
			dayString = "Wedesde";
			break;
		case 4:
			dayString = "Thusday";
			break;
		case 5:
			dayString = "friday";
			break;
		case 6:
			dayString = "Saturday";
			break;
		case 7:
			dayString = "sunday";
			break;
		default:
			dayString = "invalid day";
		}
//		System.out.println("inserted day is= " + dayString);

		switch (Day) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			daytype = "week DAY";
			break;
		case 6:
		case 7:
			daytype = "Wekend Holiday";
			break;
		default:
			daytype = "invalid Day";
		}
		System.out.println("Inserted Day is= " + dayString + "\t\tand this day is= " + daytype);
	}

}
