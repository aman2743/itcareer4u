package actionsClassInSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		

	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Actions actions=new Actions(driver);
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	Thread.sleep(2000);
	WebElement source=driver.findElement(By.id("box7"));
	WebElement target=driver.findElement(By.id("box103"));
//	actions.clickAndHold(source).moveToElement(target).release().build().perform();
	Thread.sleep(2000);
	actions.dragAndDrop(source, target).build().perform();
	}
}
