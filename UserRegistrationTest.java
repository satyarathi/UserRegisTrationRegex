package com.userregistration_junit;
import org.junit.Assert;
import org.junit.Test;
public class UserRegistrationTest {

	UserRegistrationJunit validator = new UserRegistrationJunit();
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue()
	{
		boolean isValid = validator.validateLastName("Jitendra");
		Assert.assertTrue(isValid);
	}
	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse()
	{
		boolean isValid = validator.validateLastName("Ji");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenFirstName_WhenFirstLetterIsSmall_ShouldReturnFalse()
	{
		boolean isValid = validator.validateLastName("jitendra");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenFirstName_WhenSpecialCharPassed_ShouldReturnFalse()
	{
		boolean isValid = validator.validateLastName("@#!");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenFirstName_WhenSpecialNumPassed_ShouldReturnFalse()
	{
		boolean isValid = validator.validateLastName("1234");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue()
	{
		boolean isValid = validator.validateLastName("Satyarathi");
		Assert.assertTrue(isValid);
	}
	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse()
	{
		boolean isValid = validator.validateLastName("Sa");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenLastName_WhenFirstLetterIsSmall_ShouldReturnFalse()
	{
		boolean isValid = validator.validateLastName("satyarathi");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenLastName_WhenSpecialCharPassed_ShouldReturnFalse()
	{
		boolean isValid = validator.validateLastName("@#!");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenLastName_WhenSpecialNumPassed_ShouldReturnFalse()
	{
		boolean isValid = validator.validateLastName("1234");
		Assert.assertFalse(isValid);
	}
	
	@Test
	public void givenPassword_WhenSpecialCharNotPassed_ShouldReturnFalse()
	{
		boolean isValid = validator.validateLastName("Jit23465Satyarthi");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenPassword_WhenNumberNotPassed_ShouldReturnFalse()
	{
		boolean isValid = validator.validateLastName("satyarathijit");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenPassword_WhenCapitalLetterNotPassed_ShouldReturnFalse()
	{
		boolean isValid = validator.validateLastName("jit@1234satyarathi");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenPassword_WhenSmallLetterNotPassed_ShouldReturnFalse()
	{
		boolean isValid = validator.validateLastName("JSATYARTHI@234");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenPassword_WhenShort_ShouldReturnFalse()
	{
		boolean isValid = validator.validateLastName("JS@s");
		Assert.assertFalse(isValid);
	}
}
