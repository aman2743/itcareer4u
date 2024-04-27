package actionsClassInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropo2 {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	Thread.sleep(2000);
	Actions actions=new Actions(driver);
	WebElement bank=driver.findElement(By.xpath("//a[text()=' BANK ']"));
	WebElement trg1=driver.findElement(By.id("bank"));
	actions.clickAndHold(bank).moveToElement(trg1).release().build().perform();
	Thread.sleep(2000);
	
	WebElement src2=driver.findElement(By.xpath("//a[text()=' 5000']"));
	WebElement trg2=driver.findElement(By.id("amt7"));
//  actions.clickAndHold(src2).moveToElement(trg2).release().build().perform();
	actions.dragAndDrop(src2, trg2).release().build().perform();
    
	WebElement src3=driver.findElement(By.xpath("//a[text()=' SALES ']"));
	WebElement trg3=driver.findElement(By.id("loan"));
	actions.clickAndHold(src3).moveToElement(trg3).release().build().perform();
	Thread.sleep(2000);
	
	WebElement src4=driver.findElement(By.xpath("//a[text()=' 5000']"));
	WebElement trg4=driver.findElement(By.id("amt8"));
    actions.clickAndHold(src4).moveToElement(trg4).release().build().perform();
	Thread.sleep(2000);
	
	WebElement check=driver.findElement(By.xpath("//a[text()='Perfect!']"));
	if(check.isDisplayed()) {
		System.out.println("Pass");
	}
	else {
		System.out.println("Fail");
	}
	
}
}
