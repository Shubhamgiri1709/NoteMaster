package testScript;

import org.testng.annotations.Test;

import baseClass.BaseClass;
import pageObject.LogIn;

public class LogInTest  extends BaseClass{
    
	@Test
	public void loginwithvalidcardentials() {
		LogIn login = new LogIn(driver);
		login.logIn();
		login.Email("shubhamgiri1709@gmail.com");
		login.Passoword("shubham23");
		login.loginBtn();
		
	}
	
	@Test
	public void loginwithinvalidcardentials() {
		LogIn login = new LogIn(driver);
		login.logIn();
		login.Email("shubhamgiri17@gmail.com");
		login.Passoword("shubham23");
		login.loginBtn();
		
	}
	
	@Test
	public void loginwithinvalidcardentialsemptyemail() {
		LogIn login = new LogIn(driver);
		login.logIn();
		login.Email("");
		login.Passoword("shubham23");
		login.loginBtn();
		
	}
	
	@Test
	public void loginwithinvalidcardentialswithemptypassword() {
		LogIn login = new LogIn(driver);
		login.logIn();
		login.Email("shubhamgiri1709@gmail.com");
		login.Passoword("");
		login.loginBtn();
		
	}
	
	@Test
	public void loginwithemptycardentials() {
		LogIn login = new LogIn(driver);
		login.logIn();
		login.Email("");
		login.Passoword("");
		login.loginBtn();
		
	}
}
