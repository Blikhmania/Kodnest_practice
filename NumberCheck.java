package com.bl.ifelse;
import java.util.Scanner;

public class NumberCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
        int number = sc.nextInt();
		if(number>0) System.out.println("entered number "+number+" is positive");
		sc.close();
	}

}
