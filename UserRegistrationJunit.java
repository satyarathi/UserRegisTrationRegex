package com.userregistration_junit;

import java.util.regex.Pattern;

public class UserRegistrationJunit {
	
	public static final String NAME_PATTERN = "^[A-Z]([a-z]{2,})";
	public static final String EMAIL_PATTERN = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+([.][a-zA-Z]{2,4})([.][a-zA-Z]{2})*$";
	public static final String MOBILE_NUMBER_PATTERN = "^[0-9]{0,2}[ ][0-9]{10}";
	public static final String PASSWORD_PATTERN = "(?=.*[A-Z])(?=.*[0-9])(?=.*[+._@!-])[0-9a-zA-Z@!+_.]{8,}";

	public boolean validateFirstName(String firstName)
	{
		try{
            if (checkValidOrNot(firstName, NAME_PATTERN) != true){
                throw new InvalidRegistrationException("Invalid First Name\nPlease Check and Enter");
            }
        }
        catch (InvalidRegistrationException e){
            System.out.println(e.getMessage());
        }
		return checkValidOrNot(firstName, NAME_PATTERN);
		
		
	}
	public boolean validateLastName(String lastName)
	{
		try{
            if (checkValidOrNot(lastName, NAME_PATTERN) != true){
                throw new InvalidRegistrationException("Invalid Last Name\nPlease Check and Enter");
            }
        }
        catch (InvalidRegistrationException e){
            System.out.println(e.getMessage());
        }
		return checkValidOrNot(lastName, NAME_PATTERN);
	}
	public boolean validateEmail(String email)
	{
		try{
            if (checkValidOrNot(email, EMAIL_PATTERN) != true){
                throw new InvalidRegistrationException("Invalid email\nPlease Check and Enter");
            }
        }
        catch (InvalidRegistrationException e){
            System.out.println(e.getMessage());
        }
		return checkValidOrNot(email, EMAIL_PATTERN);
	}
	public boolean validateMobileNumber(String mobileNum)
	{
		try{
            if (checkValidOrNot(mobileNum, MOBILE_NUMBER_PATTERN) != true){
                throw new InvalidRegistrationException("Invalid mobile number\nPlease Check and Enter");
            }
        }
        catch (InvalidRegistrationException e){
            System.out.println(e.getMessage());
        }
		return checkValidOrNot(mobileNum, MOBILE_NUMBER_PATTERN);

	}
	public boolean validatePassword(String password)
	{
		try{
            if (checkValidOrNot(password, PASSWORD_PATTERN) != true){
                throw new InvalidRegistrationException("Invalid password\nPlease Check and Enter");
            }
        }
        catch (InvalidRegistrationException e){
            System.out.println(e.getMessage());
        }
		return checkValidOrNot(password, PASSWORD_PATTERN);
	}

	public boolean checkValidOrNot(String userInput,String patternRegex)
	{
		
		return Pattern.compile(patternRegex).matcher(userInput).matches();
	} 
}
