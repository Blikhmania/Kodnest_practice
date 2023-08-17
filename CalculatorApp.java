// do operation on user given operation on user given operand
package com.bl.ifelse;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		ArithmaticOperation ao = new ArithmaticOperation();
		SwitchArithmatic sa = new SwitchArithmatic();
		System.out.print("Enter two intiger ");
//		ao.val = sc.nextInt();
//		ao.num = sc.nextInt();
		sa.val = sc.nextInt();
		sa.num = sc.nextInt();

		System.out.println("choose any one option for operation");
		System.out.println("+,A,a --> Addition");
		System.out.println("-,S,s --> Subtraction");
		System.out.println("*,M,m --> Multiplication");
		System.out.println("/,D,d --> Division");
		System.out.println("%,R,r --> Modulo division");
//		ao. choice = sc.next().charAt(0);
		sa. choice = sc.next().charAt(0);
//		ao.operation();
		sa.operation();
		sc.close();

	}

}

// operation based on if else ladder
//class ArithmaticOperation {
//	int val, num;
//	char choice;
//
//	public void operation() {
//		if (choice == '+' || choice == 'A' || choice == 'a')
//			add(val, num);
//		else if (choice == '-' || choice == 'S' || choice == 's')
//			sub(val, num);
//		else if (choice == '*' || choice == 'M' || choice == 'm')
//			mul(val, num);
//		else if (choice == '/' || choice == 'D' || choice == 'd')
//			div(val, num);
//		else if (choice == '%' || choice == 'R' || choice == 'r')
//			mod(val, num);
//		else
//			System.out.println("invalid input");
//	}
//
//	public void add(int val, int num) {
//		System.out.println(val + "+" + num + "=" + (val + num));
//	}
//
//	public void sub(int val, int num) {
//		System.out.println(val + "-" + num + "=" + (val - num));
//	}
//
//	public void mul(int val, int num) {
//		System.out.println(val + "*" + num + "=" + (val * num));
//	}
//
//	public void div(double val, double num) {
//		System.out.println((int) val + "/" + (int) num + "=" + (val / num));
//	}
//
//	public void mod(int val, int num) {
//		System.out.println(val + "%" + num + "=" + (val % num));
//	}
//}

//operation based on switch case
class SwitchArithmatic {
	int val, num;
	char choice;

	public void operation() {
		switch (choice) {
		case '+':
			add(val, num);
			break;
		case '-':
			sub(val, num);
			break;
		case '*':
			mul(val, num);
			break;
		case '/':
			div(val, num);
			break;
		case '%':
			mod(val, num);
			break;
		default:
			System.out.println("invalid input");

		}
	}

	public void add(int val, int num) {
		System.out.println(val + "+" + num + "=" + (val + num));
	}

	public void sub(int val, int num) {
		System.out.println(val + "-" + num + "=" + (val - num));
	}

	public void mul(int val, int num) {
		System.out.println(val + "*" + num + "=" + (val * num));
	}

	public void div(double val, double num) {
		System.out.print((int) val + "/" + (int) num + "=");
		System.out.printf("%.2f",(val/num));
	}

	public void mod(int val, int num) {
		System.out.println(val + "%" + num + "=" + (val % num));
	}
}






