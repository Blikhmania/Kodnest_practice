package com.bl.ifelse;
import java.util.Scanner;

public class VotingInspction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter your age ");
		//taking input from user and passing it to eligibility check method
		checkEligibility((int) sc.nextInt());
		sc.close();
	}

	private static void checkEligibility(int age) {
		// Method to check eligibility
		if (age >= 18) {
			// checking eligibility and print success message
			System.out.println("Eligible for voting");
		} else {
			// checking non-eligibility and print unsuccessful message
			System.out.println("NOT ELIGIBLE!!!");
		}

	}

}