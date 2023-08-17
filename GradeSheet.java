/* Write a program to print grades as per below table
 * marks         grades
 * >90             A
 * >75<=90         B
 * >60<=75         C
 * >45<=60         D
 * >=35<=45        E
 * <35             F
 */
package com.bl.ifelse;

import java.util.Scanner;

public class GradeSheet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GradingSystem gs = new GradingSystem();
		System.out.print("Enter your marks ");
		gs.gradeSelect(sc.nextInt());
		sc.close();
	}
}

class GradingSystem {
		public void gradeSelect(int marks) {
			if (marks > 90 && marks <= 100)
				System.out.println("A");
			else if (marks > 75 && marks <= 90)
				System.out.println("B");
			else if (marks > 60 && marks <= 75)
				System.out.println("C");
			else if (marks > 45 && marks <= 60)
				System.out.println("D");
			else if (marks >= 35 && marks <= 45)
				System.out.println("E");
			else if (marks < 35 && marks >= 0)
				System.out.println("F");
			else
				System.out.println("Invalid Input");

		}
}
