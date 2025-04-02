package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp {
WebDriver driver;
	
	//constructor
   public SignUp(WebDriver driver)
	 {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//Locator
   //click on Sign up
	
	@FindBy(xpath="(//strong[normalize-space()='Sign Up'])[1]")
	WebElement signup;
	
	@FindBy(xpath="//input[@id='name']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='confirmPassword']")
	WebElement confirmpassword;
	
	@FindBy(xpath="(//strong[contains(text(),'Sign Up')])[2]")
	WebElement signupbtn;
	
	
	public void signUp() {
		signup.click();
	}
	
	public void userName(String name) {
		username.sendKeys(name);
	} 
	
	public void Email(String mail) {
		email.sendKeys(mail);
	}
	
	public void Password(String pass) {
		password.sendKeys(pass);
	}
	
	public void confirmPassword(String cpass) {
		confirmpassword.sendKeys(cpass);
	}
	
	public void createAccount() {
		signupbtn.click();
	}
	
	
	
	
}
