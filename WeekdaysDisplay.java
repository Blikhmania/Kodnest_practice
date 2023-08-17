// take input from user to display corresponding weekdays
package com.bl.ifelse;


import java.util.Scanner;

public class WeekdaysDisplay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DayDisplay dd = new DayDisplay();
		System.out.println("enter a number");
		dd.displaydays(sc.nextInt());
		sc.close();
	}

}

class DayDisplay {

	public void displaydays(int day) {
		if (day == 1)
			System.out.println("Sunday");
		else if (day == 2)
			System.out.println("Monday");
		else if (day == 3)
			System.out.println("Tuesday");
		else if (day == 4)
			System.out.println("Wednesday");
		else if (day == 5)
			System.out.println("Thursday");
		else if (day == 6)
			System.out.println("Friday");
		else if (day == 7)
			System.out.println("Saturday");
		else
			System.out.println("invalid input");
	}

}
