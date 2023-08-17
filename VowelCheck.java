package com.bl.ifelse;
import java.util.Scanner;

public class VowelCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a alphabet ");
		checkVowelOrConsonent(sc.next().charAt(0));
		sc.close();
	}

	private static void checkVowelOrConsonent(char alphabet) {
		// Method to check user given alphabet is vowel or consonant)
		if (alphabet == 'a' || alphabet == 'A' || alphabet == 'e' || alphabet == 'E' || alphabet == 'i'
				|| alphabet == 'I' || alphabet == 'o' || alphabet == 'O' || alphabet == 'u' || alphabet == 'U')
			// checking foe vowel and print message
			System.out.println("entered character " + alphabet + " is vowel"); 
		else
		    // checking for consonant and print message
			System.out.println("entered character " + alphabet + " is consonant");
	}
}