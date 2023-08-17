package com.bl.ifelse;
import java.util.Scanner;

public class TechClub {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter your cgpa");
		double cgpa = sc.nextDouble();
		if(cgpa>=8.0) {
			System.out.println("Welcome to the Tech Club.");
		}
		else {
			System.out.println("Try again next time.");
		}
		sc.close();
	}
}
