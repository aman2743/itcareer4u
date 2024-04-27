package actionsClassInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboradOperationsUsingMultipleKeys {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		driver.get("https://text-compare.com/");
		WebElement input1 = driver.findElement(By.id("inputText1"));
		WebElement input2 = driver.findElement(By.id("inputText2"));
		input1.sendKeys("This is Selenium Testing");

//		Ctrl+A
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("a");
		actions.keyUp(Keys.CONTROL);
		actions.perform();
		
//		Ctrl+C
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("c");
		actions.keyUp(Keys.CONTROL);
		actions.perform();
		
//	    Tab key
		actions.sendKeys(Keys.TAB);
		
//		Ctrl+V
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("v");
		actions.keyUp(Keys.CONTROL);
		actions.perform();

		if (input1.getAttribute("value").equals(input2.getAttribute("value"))) {
			System.out.println("Text copied successfully");
		} else {

			System.out.println("Text not Copied");

		}

	}
}
