package com.userregistration_junit;

import java.util.Scanner;
import java.util.regex.Pattern;

@FunctionalInterFace
interface Validate{
	boolean validator(String val);
}

public class LambdaRegitration {

	public static final String NAME_PATTERN = "^[A-Z]([a-z]{2,})";
	public static final String EMAIL_PATTERN = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+([.][a-zA-Z]{2,4})([.][a-zA-Z]{2})*$";
	public static final String MOBILE_NUMBER_PATTERN = "^[0-9]{10}";
	public static final String PASSWORD_PATTERN = "(?=.*[A-Z])(?=.*[0-9])(?=.*[+._@!-])[0-9a-zA-Z@!+_.]{8,}";

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your first name : ");
		String sc = scanner.next();

		Validate n1 = (fname)->{  

			if (checkValidOrNot(fname, NAME_PATTERN) != true){
				System.out.println("Invalid First Name");
			}else {
				System.err.println("Valid First Name");
			}
			return false;
		};
		n1.validator(sc);
		
		System.out.println("Enter your last name : ");
		String sc2 = scanner.next();
		Validate n2 = (lname)->{  

			if (checkValidOrNot(lname, NAME_PATTERN) != true){
				System.out.println("Invalid Last Name");
			}else {
				System.err.println("Valid Last Name");
			}
			return false;
		};
		n2.validator(sc2);
		
		System.out.println("Enter your email id : ");
		String sc3 = scanner.next();
		Validate n3 = (email)->{  

			if (checkValidOrNot(email, EMAIL_PATTERN) != true){
				System.out.println("Invalid Email id");
			}else {
				System.err.println("Valid Email id");
			}
			return false;
		};
		n3.validator(sc3);
		
		System.out.println("Enter your mobile no : ");
		String sc4 = scanner.next();
		Validate n4 = (mNumber)->{  

			if (checkValidOrNot(mNumber, MOBILE_NUMBER_PATTERN) != true){
				System.out.println("Invalid Mobile no");
			}else {
				System.err.println("Valid Mobile no");
			}
			return false;
		};
		n4.validator(sc4);
		
		System.out.println("Enter your password : ");
		String sc5 = scanner.next();
		Validate n5 = (password)->{  

			if (checkValidOrNot(password, PASSWORD_PATTERN) != true){
				System.out.println("Invalid Password");
			}else {
				System.err.println("Valid Password");
			}
			return false;
		};
		n5.validator(sc5);

	}

	private static boolean checkValidOrNot(String userInput, String patternRegex) {
		return Pattern.compile(patternRegex).matcher(userInput).matches();	
	}
}