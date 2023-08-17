package com.bl.sumofn;

import java.util.Scanner;

public class SumOfN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
        int sum =0;
		for(int i=1;i<=num;i++)
			sum+=i;
		System.out.println("Sum of "+num+" natural number is "+sum);
		sc.close();
	}

}
