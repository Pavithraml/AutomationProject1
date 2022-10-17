import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Signup {
	
	//SIGNUP WITH VALID INFORMATION IN THE REQUIRED FIELD

	@Test
	public void demo() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pavithra.m\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("button.btn.btn-warning.my-2.my-sm-0")).click();
		Thread.sleep(1000);
        driver.findElement(By.linkText("Sign up")).click();
        Thread.sleep(1000);
        // Thread.sleep(5000);
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Pavithra");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Murugan");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("pavi8392@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type='Password']")).sendKeys("Pavi8392@");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type='date']")).sendKeys("07");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type='date']")).sendKeys("07");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type='date']")).sendKeys("2000");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"myForm\"]/div[3]/div[4]/input")).click();
        Thread.sleep(1000);
        ///driver.findElement(By.className("Female")).click();
        ///driver.findElement(By.xpath("/div/)).click();
        driver.findElement(By.xpath("//input[@min='0']")).sendKeys("8778204990");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("Hii...pavithra murugan!");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.btn.btn-info.form-control")).click();
        Thread.sleep(1000);
        driver.quit();
	}
	
}








