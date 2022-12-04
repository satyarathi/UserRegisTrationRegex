package com.userregistration_junit;

import java.util.Scanner;

public class UserRegistrationMain {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your first name : ");
		String firstName = scanner.next();
		UserRegistrationJunit validator = new UserRegistrationJunit();
		System.out.println(validator.validateFirstName(firstName));

		System.out.println("Enter your last name : ");
		String lastName = scanner.next();
		System.out.println(validator.validateLastName(lastName));

		System.out.println("Enter your email address : ");
		String email = scanner.next();
		System.out.println(validator.validateEmail(email));

		System.out.println("Enter your password : ");
		String password = scanner.next();
		System.out.println(validator.validatePassword(password));
		scanner.close();
	}

}
