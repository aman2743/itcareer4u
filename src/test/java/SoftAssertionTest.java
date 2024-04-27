import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertionTest {
	SoftAssert softAssert = new SoftAssert();

	@Test
	public void LoginTest() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		driver.get("https://demo.testfire.net/login.jsp");
		driver.findElement(By.id("uid")).sendKeys("jsmith");
		driver.findElement(By.id("passw")).sendKeys("demo1234");
		driver.findElement(By.name("btnSubmit")).click();
		String expectedTitle = "Login";
		String actualTitle = driver.getTitle();
		softAssert.assertEquals(actualTitle, expectedTitle, "Title Mismatched");
		boolean pLink = driver.findElement(By.linkText("PERSONAL")).isDisplayed();
		softAssert.assertAll();
		softAssert.assertFalse(pLink);
//		Assert.assertFalse(pLink);
		driver.quit();
	}
}
