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
@Test
public void givenLastName_WhenProper_ShouldReturnTrue() {
	boolean isValid = register.validateLastName("Samalla");
	Assert.assertTrue(isValid);
}
@Test
public void givenLastName_WhenNotProper_ShouldReturnFalse() {
	boolean isValid = register.validateLasttName("samalla");
	Assert.assertFalse(isValid);
}
@Test
public void givenLastName_WhenShort_ShouldReturnFalse() {
	boolean isValid = register.validateLastName("sa");
	Assert.assertFalse(isValid);
}
@Test
public void givenEmail_WhenProper_ShouldReturnTrue() {
	boolean isValid = register.validateEmail("qrs@gmail.com");
	Assert.assertTrue(isValid);
}
@Test
public void givenEmail_When_ShouldReturnFalse() {
	boolean isValid = register.validateEmail(".qrs@gmail.com");
	Assert.assertFalse(isValid);
}
@Test
public void givenPhoneNumber_When_ShouldReturnTrue() {
	boolean isValid = register.validatePhoneNumber("0987654321");
	Assert.assertTrue(isValid);
}
@Test
public void givenPhoneNumber_When_ShouldReturnFalse() {
	boolean isValid = register.validatePhoneNumber("34525");
	Assert.assertFalse(isValid);
}

}