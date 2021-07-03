package A_GfG_DesitionMakingLoop;

//	Can't understand
public class BreakLabel_cannotUnderstoot {
	// Java program to illustrate using break with goto
		public static void main(String args[])
		{
			boolean t = true;
			// label first
			First:
			{
				// Illegal statement here as label second is not
				// introduced yet break second;
				Second:
				{
					Third:
					{
						// Before break
						System.out.println("Before the break statement");

						// break will take the control out of
						// second label
						if (t)
							break Second;
						System.out.println("This won't execute.");
					}
					System.out.println("This won't execute.");
				}
				// First block
				System.out.println("This is after second block.");
			}
		}
	}

	
	
	
	
	

