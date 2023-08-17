
import java.util.Scanner;

public class FinancialQuater {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String month = sc.next();
		switch (month) {
		case "january":
		case "febuary":
		case "march":
			System.out.println("Quater 4");
			break;
		case "april":
		case "may":
		case "june":
			System.out.println("Quater 1");
			break;
		case "july":
		case "august":
		case "september":
			System.out.println("Quater 2");
			break;
		case "october":
		case "novenber":
		case "december":
			System.out.println("Quater 3");
			break;
		default:
			System.out.println("invalid month");
		}
		sc.close();
	}

}
