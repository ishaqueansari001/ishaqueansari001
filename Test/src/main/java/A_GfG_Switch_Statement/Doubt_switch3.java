package A_GfG_Switch_Statement;

public class Doubt_switch3 {
	public static void main(String[] args) {
		String BranchName= "computer scince";
		int year =2;
		
		switch(year) {
		case 1:
			System.out.println("course= english,algebra");
			break;
		case 2:
			switch(BranchName) {// nested switch
			
			case "computer scince":
			case "cce":
				System.out.println("course=machine learning and big data");
				break;
				
			case "abc":	
				System.out.println("course= abc");
			case "aaa":
				System.out.println("course= aaa");
				
				
				
				
			}
		
		}
		
	}

}
