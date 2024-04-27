package actionsClassInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Actions actions=new Actions(driver);
	driver.get("https://www.flipkart.com/");
	WebElement fashion=driver.findElement(By.xpath("//span[text()='Fashion']"));
	Thread.sleep(3000);
//	hover mouse over Fashion option
	actions.moveToElement(fashion).build().perform();
	WebElement mensBottomWear= driver.findElement(By.linkText("Men's Bottom Wear"));
	Thread.sleep(2000);
//	hover mouse over Men's Bottom Wear
	actions.moveToElement(mensBottomWear).build().perform();
	WebElement womenFootwear=driver.findElement(By.linkText("Women Footwear"));
	actions.moveToElement(womenFootwear).build().perform();	
//	hover mouse Women Footwear
	WebElement womenHeels=driver.findElement(By.linkText("Women Heels"));
//	click the option Women Heels
	actions.click(womenHeels).build().perform();
	System.out.println(driver.getTitle());

	
}
}
