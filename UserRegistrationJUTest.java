package com.bridgelabz.userregistration;
import org.junit.Assert;

public class UserRegistrationJUTest {
	UserRegistration register = new UserRegistration();
public void UserRegistrationTest() {
	}
@Test
public void givenFirstName_WhenProper_ShouldReturnTrue() {
	boolean isValid = register.validateFirstName("Krishna");
	Assert.assertTrue(isValid);
}
@Test
public void givenFirstName_WhenNotProper_ShouldReturnFalse() {
	boolean isValid = register.validateFirstName("krishna");
	Assert.assertFalse(isValid);
}
@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() {
	boolean isValid = register.validateFirstName("kr");
	Assert.assertFalse(isValid);
}	
}