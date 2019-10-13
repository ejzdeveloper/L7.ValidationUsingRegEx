// Author: Jackie Zablah. Java Bootcamp 2019.
package lab7;

import java.util.Scanner;

public class ValidationUsingRegEx {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		validateNames(scnr, ">>Please enter a valid name: ");
		validateEmail(scnr, ">>Please enter a valid email: ");
		validatePhone(scnr, ">>Please enter a valid phone number: ");
		validateDate(scnr, ">>Please enter a valid date: ");
		validateHTML(scnr, ">>Please enter a HTML tag: ");
		System.out.println(">>Goodbye!");
		scnr.close();

	}

	public static void validateNames(Scanner scnr, String prompt) {
		boolean isValid = false;
		String input;
		do {
			System.out.print(prompt);
			input = scnr.nextLine();
			if (input.matches("([A-Z]){1}([a-z]){1,29}")) {
				System.out.println("Valid name!");
				isValid = true;
			} else {
				System.out.println("Sorry, name is not valid!");
			isValid = false;
			}
		} 
		while (!isValid);
	
	}

	public static void validateEmail(Scanner scnr, String prompt) {
		boolean isValid = false;
		String input;
		do {
			System.out.println(prompt);
			input = scnr.nextLine();
			if ((input.matches("([A-Za-z0-9]){5,30}@([A-Za-z0-9]){5,10}.([a-z0-9]){2,3}"))) {
				System.out.println("Valid Email!");
				isValid = true;
			} else {
				System.out.println("Sorry, email is not valid!");
			isValid = false;
			}
		} 
		while (!isValid);
	}

	public static void validatePhone(Scanner scnr, String prompt) {
		boolean isValid = false;
		String input;
		do {
			System.out.println(prompt);
			input = scnr.nextLine();
			if ((input.matches("\\d\\d\\d[-]\\d\\d\\d[-]\\d\\d\\d\\d"))) {
				System.out.println("Valid phone number!");
				isValid = true;
			} else {
				System.out.println("Sorry, phone number is not valid!");
			isValid = false;
			}
		}
		while (!isValid);
	}

	public static void validateDate(Scanner scnr, String prompt) {
		boolean isValid = false;
		String input;
		do {
			System.out.println(prompt);
			input = scnr.nextLine();
			if ((input.matches("\\d\\d[/]\\d\\d[/]\\d\\d\\d\\d"))) {
				System.out.println("Valid date format!");
				isValid = true;
			} else {
				System.out.println("Sorry, date is not valid!");
			isValid = false;
			}
		} 
		while (!isValid);
	}

	public static void validateHTML(Scanner scnr, String prompt) {
		boolean isValid = false;
		String input;
		do {
			System.out.println(prompt);
			input = scnr.nextLine();
			if ((input.matches("(\\<\\w*)((\\s\\/\\>)|(.*\\<\\/\\w*\\>))"))) {
				System.out.println("Valid HTML tag!");
				isValid = true;
			} else {
				System.out.println("Sorry, HTML is not valid!");
			isValid = false;
			}
		} 
		while (!isValid);
	}
}
