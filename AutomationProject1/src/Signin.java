import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Signin{
	
	@Test()
	public void login()throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pavithra.m\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("pavithra murugan");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("pavi8392");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='btn btn-primary btn-block']")).click();
		Thread.sleep(1000);
		driver.quit();
	}
	
}



 


