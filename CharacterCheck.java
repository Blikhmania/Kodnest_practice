package com.bl.ifelse;
import java.util.Scanner;

public class CharacterCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a alphabet ");
		// Taking character value from user and passing it to check method
		checkCharacter(sc.next().charAt(0));
		sc.close();
	}

	public static void checkCharacter(char character) {
		// checking if given character is upper case alphabet
		if (character >= 65 && character <= 90)
			System.out.println("Entered character " + character + " is in uppercase");
		// checking if given character is lower case alphabet
		else if (character >= 97 && character <= 122)
			System.out.println("Entered character " + character + " is in lowercase");
		// checking if given character is a number
		else if (character >= 48 && character <= 57)
			System.out.println("Entered character " + character + " is a number");
		// checking if given character is a special character
		else
			System.out.println("Entered character " + character + " is a special character");
		
	}
	
}

