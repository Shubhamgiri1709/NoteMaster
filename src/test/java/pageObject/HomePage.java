package pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import testScript.LogInTest;

public class HomePage {
WebDriver driver;
	
	//constructor
   public HomePage(WebDriver driver)
	 {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
   
   @FindBy(xpath="(//h3[normalize-space()='AI-Generated Quizzes'])[1]")
	WebElement ai;
	//click on Note Master
	
	@FindBy(xpath="(//p[@class='text-[20px] font-bold'])[1]")
	WebElement notemaster;
	
		
	@FindBy(xpath="//input[@id='email']")
	WebElement email;
			
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
			
	@FindBy(xpath="(//strong[contains(text(),'Login')])[2]")
	WebElement loginbtn;
			
	// click on create nootbook
	@FindBy(xpath="(//strong[normalize-space()='Create NoteBook'])[1]")
	WebElement createnotebook;	
			
		// click on title
	@FindBy(xpath="//input[@id='title']")
	WebElement title;
	
	// click on title
	@FindBy(xpath="(//strong[normalize-space()='Submit'])[1]")
	WebElement submit;
			
	// click on write notes
	@FindBy(xpath="//strong[normalize-space()='Write Notes']")
	WebElement writenotes;
	
	// click on Notes title and write notes title
	@FindBy(xpath="//input[@placeholder='Notes Title']")
	WebElement notetitle;
	
	//click on note an write note
	@FindBy(xpath="(//div[@class='ql-editor ql-blank'])[1]")
	WebElement note;
	
	//select note book
	@FindBy(xpath="(//div[@class='css-19bb58m'])[1]")
	WebElement notebook;
	
	
	//Add remainder
	@FindBy(xpath="(//strong[normalize-space()='Add Reminder'])[1]")
	WebElement addreminder;
	
	// save changes
	@FindBy(xpath="(//strong[normalize-space()='Save Changes'])[1]")
	WebElement savechanges;
	
	
	// click on user
	@FindBy(xpath="//img[@alt='User Profile']")
	WebElement userprofile;
	
	// click on profile
    @FindBy(xpath="//li[normalize-space()='Profile']")
	WebElement profile;
    
 // click on profile
    @FindBy(xpath="(//div[@class='fixed inset-0 bg-black bg-opacity-50 z-10'])[1]")
	WebElement clickk;
    
    
 // click on edit profile
    @FindBy(xpath="//strong[@class='flex items-center justify-center']")
	WebElement editprofile;
	
 // click on enter
    @FindBy(xpath="(//label[@class='absolute bottom-0 right-0 bg-primary-500 text-white p-2 rounded-full cursor-pointer'])[1]")
	WebElement enter;
	
 // click on save changes
    @FindBy(xpath="(//*[name()='svg'][@stroke='currentColor'])[1]")
	WebElement save;
    
 // click on todo
    @FindBy(xpath="//li[normalize-space()='Todo']")
	WebElement todo;
    
 // click on Dashboard
    @FindBy(xpath="//li[normalize-space()='Dashboard']")
	WebElement dashboard;
    
 // click on All notes
    @FindBy(xpath="//li[normalize-space()='All Notes']")
	WebElement allnotes;
    
 // click on All notes
    @FindBy(xpath="//li[normalize-space()='All Note Books']")
	WebElement allnotebooks;
    
 // click on All notes
    @FindBy(xpath="//li[normalize-space()='Logout']")
	WebElement logout;
    
    
    
    
    
    public void Ai() {
		ai.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", ai);
	}
	
	
	
	
	public void noteMaster() {
		notemaster.click();
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

	 
	public void createNotebook() {
		createnotebook.click();
	}
	
	public void Submit() {
		submit.click();
	}
	
	public void Title(String tit) {
		title.sendKeys(tit);
	}
	
	public void writeNotes() {
		writenotes.click();
	}
	
	public void noteTitle(String ti) {
		notetitle.sendKeys(ti);
	}
	
	public void Note(String n) {
		note.sendKeys(n);
	}
	
	public void noteBook(String nb) {
		//notebook.sendKeys(nb);
		notebook.click();
		Select sl = new Select(notebook);
		sl.selectByVisibleText(nb);
	}
	
	public void addReminder() {
		addreminder.click();
	}
	
	public void saveChanges() {
		savechanges.click();
		
	}
	
	public void userProfile() {
		userprofile.click();
	}
	
	public void Profile() throws InterruptedException {
		Thread.sleep(2000);
		profile.click();
	}
	
	public void Clickk() {
		clickk.click();
	}
	public void editProfile() {
		editprofile.click();
	}
	
	public void Enter(String en) {
		enter.sendKeys(en);
	}
	
	public void Save() {
		save.click();
	}
	
	public void Todo() {
		todo.click();
	}
	
	public void  dashDoard() {
		 dashboard.click();
	}
	
	public void  allNotes() {
		allnotes.click();
	}
	
	public void  allnoteBooks() {
		allnotebooks.click();
	}
	
	public void  logOut() {
		logout.click();
	}
	
	
	
	
	
	
	
}
