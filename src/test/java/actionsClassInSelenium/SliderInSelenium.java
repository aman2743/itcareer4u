package actionsClassInSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SliderInSelenium {
	public static void main(String[] args) throws InterruptedException {
		

	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Actions actions=new Actions(driver);
	driver.get("https://jqueryui.com/slider/");
	Thread.sleep(2000);
	driver.switchTo().frame(0);
	Thread.sleep(2000);
	WebElement slider=driver.findElement(By.xpath("//span[contains(@class,'ui-slider-handle')]"));
	actions.dragAndDropBy(slider,500, 0).release().build().perform();
	}
}
