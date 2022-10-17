import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Open {
	WebDriver driver;

	
         public Open(WebDriver driver) {
		     this.driver=driver;
		     PageFactory.initElements(driver,this);
	     }
     
     @FindBy(css="button[type='submit']")
     WebElement button; //applied for signing button
     @FindBy(id="username")
     WebElement usernameele;
     
     @FindBy(id="password")
     WebElement passwordele;
     
     @FindBy(linkText="Log In")
     WebElement submit;
     @FindBy(id="home")
     WebElement text;
     @FindBy(id="home")
     WebElement Home;
     
	public void signin(String username, String password) {
		// TODO Auto-generated method stub
		
	}

	public void home() {
		// TODO Auto-generated method stub
		
	}

}
