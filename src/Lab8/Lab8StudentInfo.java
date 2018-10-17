package Lab8;

import java.util.Scanner;
import java.util.Arrays;

public class Lab8StudentInfo {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String userAns = null;

		String[] studentName = { "Charles", "Lucy", "Sally", "Linus", "Patty", "Marcy" };
		String[] studentHome = { "Detroit, MI", "Grand Rapids, MI", "Miami, FL", "San Francisco, CA", "Dearborn, MI", "Atlanta, GA" };
		String[] studentFood = { "Pizza", "Tacos", "Cereal", "Hamburgers", "Hot Dogs", "Lasagna" };

		System.out.println("Welcome to 'Peanuts University'! Please welcome our new students: ");
		System.out.println();
		int i;
		for (i = 0; i < studentName.length; i++) {
			System.out.println((i + 1) + ". " + studentName[i]);
		}
		System.out.println();
		
		do {
			int userChoice = getInt(scnr, "Please enter the number of the student you'd like to learn about: ", 1, studentName.length);
			System.out.println();
			System.out.println("What would you like to know about " + (studentName[userChoice - 1]) + "? (hometown/favorite food)");
			String userChoice2 = scnr.nextLine();
				if (userChoice2.equalsIgnoreCase("hometown")) {
					System.out.println((studentName[userChoice - 1]) + "'s hometown is " + (studentHome[userChoice - 1]) + ".");
				} else if (userChoice2.equalsIgnoreCase("favorite food")){
					System.out.println((studentName[userChoice - 1] + "'s favorite food is " + (studentFood[userChoice - 1]) + "."));
				}else {
					System.out.println("That is not a valid choice. Please try again: ");
				}
			System.out.println("\nWould you like to learn more? (y/n)");
			userAns = scnr.next();
		} while (userAns.equalsIgnoreCase("y"));

		System.out.println("Ok, thanks for your interest in the folks at 'Peanuts University'. Have a nice day!");

	}

	public static int getInt(Scanner sc, String prompt) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("Invalid choice. Please try again:");
			}
			sc.nextLine();
		}
		return i;
	}
	public static int getInt(Scanner sc, String prompt, int min, int max) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			i = getInt(sc, prompt);
			if (i < min)
				System.out.println("Invalid entry. Entry must be an existing student number.\n");
			else if (i > max)
				System.out.println("Invalid entry. Entry must be an existing student number.\n");
			else
				isValid = true;
		}
		return i;
	}
}
