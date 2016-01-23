import java.util.Scanner;

public class Session2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* For Assignment 1 */
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int age = 0;
		System.out.print("Enter your age: ");
		age = in.nextInt();
		if (age < 18) {
			System.out.println("Sorry you are not eligible to vote");
		} else {
			System.out.println("Your are eligible to vote.");
		}
		/*For other assignments*/
		Session2 obj = new Session2();
		/* For Assignment 2 */
		obj.GeneratePrimeNumbers();
		/*For Assignment 3*/
		obj.GenerateTower();
		/*For Assignment 4*/
		obj.GiveTotalDays();
	}
	
	/* For Assignment 2 */
	public void GeneratePrimeNumbers() {
		int i = 1, j = 1;
		boolean x = false;
		//System.out.print("1,");
		for (i = 1; i <= 100; i++) {
			for (j = 2; j <= 50; j++) {
				if (j != i) {
					if (i % j == 0) {
						x = false;
						//System.out.println(i);
						break;
						// System.out.println();
					} else {
						x = true;
					}
				}

			}
			if (x == true) {
				System.out.print(i);
				if (i != 100) {
					System.out.print(" ");
				}
				x = false;
			}
		}
	}
	/*For Assignment 3*/
	public void GenerateTower()
	{
		System.out.println();
		int i = 1, j = 0;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for (i = 1; i <= 4; i++) {
			for (j = 4; j >= i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}

	}
	/*For Assignment 4*/
	
	public void GiveTotalDays()
	{
		String monthname="";
		System.out.println("Enter Month Name(short form -> 3 letters only):");
		Scanner name= new Scanner(System.in);
		monthname=name.next();
		name.close();
		monthname = monthname.toLowerCase();
		switch(monthname)
		{
		case "jan":
		case "january":
			System.out.println("31");
			break;
		case "feb":
		case "february":
			System.out.println("28");
			break;
		case "mar":
		case "march":
			System.out.println("31");
			break;
		case "apr":
		case "april":
			System.out.println("30");
			break;
		case "may":
			System.out.println("31");
			break;
		case "jun":
		case "june":
			System.out.println("30");
			break;
		case "jul":
		case "july":
			System.out.println("31");
			break;
		case "aug":
		case "august":
			System.out.println("31");
			break;
		case "sep":
		case "september":
			System.out.println("30");
			break;
		case "oct":
		case "october":
			System.out.println("31");
			break;
		case "nov":
		case "november":
			System.out.println("30");
			break;
		case "dec":
		case "december":
			System.out.println("31");
			break;
		default:
				System.out.println("Please enter correct month name...bye");
		}
	}
}
