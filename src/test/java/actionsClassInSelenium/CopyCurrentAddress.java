package actionsClassInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CopyCurrentAddress {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		Actions actions=new Actions(driver);
		WebElement cAddress=driver.findElement(By.id("currentAddress"));
		WebElement pAddress=driver.findElement(By.id("permanentAddress"));
		
         cAddress.sendKeys("Ug-03,c-43,45"+"\n"+"Sai upvan Society"+"\n"+"Greater Noida West");
//       Ctrl+A
         actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
//       actions.sendKeys("a");
//       actions.keyUp(Keys.CONTROL);
//       actions.build().perform();
         
//      Ctrl+C   
        actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).release().build().perform();
         
//       actions.sendKeys("c");
//       actions.keyUp(Keys.CONTROL);
//       actions.release().build().perform();
         
//       Tab press
         actions.sendKeys(Keys.TAB);
         
//       Ctrl+v
         actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
//       actions.sendKeys("v");
//       actions.keyUp(Keys.CONTROL);
//       actions.build().perform();
         
         if(cAddress.getAttribute("value").equals(pAddress.getAttribute("value"))) {
        	 System.out.println("Address copied");
         }
         else {
        	 System.out.println("Address not copied");
         }
         
	}

}
