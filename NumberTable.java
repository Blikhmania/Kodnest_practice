package com.bl.looptable;

import java.util.Scanner;

public class NumberTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 1; i < 11; i++) {
//			if (i==10)System.out.println(num + " * " + i + " = " + (num * i));
//			else System.out.println(num + " * " + i + "  = " + (num * i));
			System.out.println(num + " * " + i + "  = " + (num * i));
		}
		  
		sc.close();
	}

}
