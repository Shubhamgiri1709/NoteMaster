package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;

public class LogIn  {
	WebDriver driver;
	
	//constructor
	
	   public LogIn(WebDriver driver)
		 {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		//Locator
	   //click on user
		@FindBy(xpath="(//strong[contains(@class,'flex items-center justify-center')][normalize-space()='Login'])[1]")
		WebElement login;
		
		
		@FindBy(xpath="//input[@id='email']")
		WebElement email;
		
		@FindBy(xpath="//input[@id='password']")
		WebElement password;
		
		@FindBy(xpath="(//strong[contains(text(),'Login')])[2]")
		WebElement loginbtn;
		
		
		
		
		public void logIn() {
			login.click();
		}
		
		public void Email(String mail) {
			email.sendKeys(mail);
		}
		
		public void Passoword(String pass) {
			password.sendKeys(pass);
		}
		
		public void loginBtn() {
			loginbtn.click();
		}
		
		
		
		
		
}
