package testScript;

import org.testng.annotations.Test;

import baseClass.BaseClass;
import pageObject.HomePage;

public class HomePageTest extends BaseClass {
	@Test
	public void createnotes() {
		HomePage homepage = new HomePage(driver);
		
		homepage.noteMaster();
		homepage.Email("shubhamgiri1709@gmail.com");
		homepage.Passoword("shubham23");
		homepage.loginBtn();
		homepage.writeNotes();
		homepage.noteTitle("Selenium");
		homepage.Note("Selenium is open source tool");
		homepage.noteBook("shubham");
		homepage.addReminder();
		homepage.saveChanges();
		
	}
	
	@Test
	public void Scrolldown() {
		HomePage homepage = new HomePage(driver);
		homepage.Ai();
		
	}
	@Test
	public void createnotebook() {
		HomePage homepage = new HomePage(driver);
		homepage.Ai();
		homepage.noteMaster();
		homepage.Email("shubhamgiri1709@gmail.com");
		homepage.Passoword("shubham23");
		homepage.loginBtn();
		homepage.createNotebook();
		homepage.Title("Sheraa");
		homepage.Submit();
	}
	
	@Test
	public void updateProfile() throws InterruptedException {
		HomePage homepage = new HomePage(driver);
		homepage.noteMaster();
		homepage.Email("shubhamgiri1709@gmail.com");
		homepage.Passoword("shubham23");
		homepage.loginBtn();
		homepage.userProfile();
		homepage.Profile();
		homepage.Clickk();
		homepage.editProfile();
		homepage.Enter("C:\\Users\\Shree\\OneDrive\\Pictures\\Saved Pictures\\WhatsApp Image 2024-11-29 at 1.07.42 PM.jpeg");
		homepage.Save();
	}

	@Test
	public void userProfile() throws InterruptedException {
		HomePage homepage = new HomePage(driver);
		homepage.noteMaster();
		homepage.Email("shubhamgiri1709@gmail.com");
		homepage.Passoword("shubham23");
		homepage.loginBtn();
		homepage.userProfile();
		homepage.Profile();
		homepage.Todo();
		homepage.dashDoard();
		homepage.allNotes();
		homepage.allnoteBooks();
		homepage.logOut();
		
	}
}
