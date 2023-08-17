package com.bl.ifelse;
import java.util.Scanner;

public class EvenCheck {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number");
		// taking input from user and passing it to check method
		checkEvenOrOdd(sc.nextInt());
		sc.close();
	}

	private static void checkEvenOrOdd(int number) {
		// Method to check user given number is even or odd
		if (number %2== 0) {
			// checking even and print message
			System.out.println("Entered number "+number+" is an EVEN NUMBER");
		} else {
			// checking odd and print  message
			System.out.println("Entered number "+number+" is an ODD NUMBER");
		}
	}
}
