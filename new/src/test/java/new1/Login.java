package new1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login 
{
	@Test
	public void test1() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://139.59.27.246:3000/login?redirect=/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='userNameOrEmail']")).sendKeys("vilaspatild@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("vilas1234");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='userNameOrEmail']")).sendKeys("demo1@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("vilas1234");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//strong[.='Programming with Java | 6th Edition']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[.='Add to Cart']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='BookStore']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='The Time Machine']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[.='Add to Cart']")).click();
		Thread.sleep(3000);
		WebElement dpdn1 = driver.findElement(By.xpath("//div[@class='list-group-item list-group-item-flush']/div[1]//select"));
		Select s=new Select(dpdn1);
		s.selectByVisibleText("3");
		Thread.sleep(3000);
		Select s1=new Select(dpdn1);
		WebElement dpdn2 = driver.findElement(By.xpath("//div[@class='list-group-item list-group-item-flush']/div[2]//select"));
		s1.selectByVisibleText("3");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[.='Proceed To Checkout']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='addressLine1']")).sendKeys("rpc layout");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='addressLine2']")).sendKeys("hampinagar");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='city']")).
		sendKeys("bangalore, karnatka, IN");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Karnataka");
		Thread.sleep(3000);
		WebElement countryDpdn = driver.findElement(By.xpath("//select[@id='country']"));
		s.selectByValue("IN");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='postalCode']")).sendKeys("560040");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("7898765674");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[.='Add New Address']")).click();

		

		

		
		
	}
}
