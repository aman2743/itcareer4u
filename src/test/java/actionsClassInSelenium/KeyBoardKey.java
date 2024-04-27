package actionsClassInSelenium;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardKey {
	public static void main(String[] args) throws InterruptedException {
		

	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Actions actions=new Actions(driver);
	driver.get("https://the-internet.herokuapp.com/key_presses");
    Thread.sleep(2000);
    actions.sendKeys(Keys.ENTER).build().perform();
    Thread.sleep(2000);
    actions.sendKeys(Keys.ESCAPE).build().perform();
    Thread.sleep(2000);
    actions.sendKeys(Keys.BACK_SPACE).build().perform();
    Thread.sleep(2000);
    actions.sendKeys(Keys.SPACE).build().perform();
    Thread.sleep(2000);
	}
}
