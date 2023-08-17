// take character input from user and its coresponding Rainbow color
package com.bl.ifelse;

import java.util.Scanner;

public class RainbowColor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ColorSelect cs = new ColorSelect();
		System.out.println("Enter a character");
		cs.colorDisplay(sc.next().charAt(0));
		sc.close();
	}

}

class ColorSelect {

	public void colorDisplay(char color) {
		if (color == 'V' || color == 'v')
			System.out.println("violet");
		else if (color == 'I' || color == 'i')
			System.out.println("indigo");
		else if (color == 'B' || color == 'b')
			System.out.println("blue");
		else if (color == 'G' || color == 'g')
			System.out.println("green");
		else if (color == 'Y' || color == 'y')
			System.out.println("yellow");
		else if (color == 'O' || color == 'o')
			System.out.println("orange");
		else if (color == 'R' || color == 'r')
			System.out.println("red");
		else
			System.out.println("Not a Rainbow Color");
	}

}
