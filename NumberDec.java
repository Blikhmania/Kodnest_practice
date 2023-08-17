package com.bl.decloop;

import java.util.Scanner;

public class NumberDec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = num; i > 0; i--)
			System.out.println(i);
		sc.close();
	}
}
