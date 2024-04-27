package actionsClassInSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {
	public static void main(String[] args) throws InterruptedException {
		

	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Actions actions=new Actions(driver);
	driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	WebElement rightClickButton=driver.findElement(By.xpath("//span[text()='right click me']"));
	actions.contextClick(rightClickButton).build().perform();
	Thread.sleep(2000);
	WebElement editOption=driver.findElement(By.xpath("//span[text()='Edit']"));
	actions.click(editOption).build().perform();
	Alert al=driver.switchTo().alert();
	Thread.sleep(2000);
	System.out.println(al.getText());
	al.accept();
	Thread.sleep(2000);
	driver.quit();
	}
}
