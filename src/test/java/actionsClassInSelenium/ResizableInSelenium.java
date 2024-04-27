package actionsClassInSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ResizableInSelenium {
	public static void main(String[] args) throws InterruptedException {
		

	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Actions actions=new Actions(driver);
	driver.get("https://jqueryui.com/resizable/");
	Thread.sleep(2000);
	driver.switchTo().frame(0);
	Thread.sleep(2000);
	WebElement resize=driver.findElement(By.xpath("//div[contains(@class,'ui-icon-gripsmall-diagonal-se')]"));
	actions.dragAndDropBy(resize,50,50).release().build().perform();
	Thread.sleep(2000);
	}
}
