package itcaree4u;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageTest {
	public static WebDriver driver;

	@BeforeMethod
	public void Launch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.navigate().to("https://itcareer4u.com");
	}

	@Test
	public void Test1() {
		System.out.println("Title First:"+driver.getTitle());
	}

	@Test
	public void Test2() {
		System.out.println("Current URL:"+driver.getCurrentUrl());
	}

	@Test
	public void Test3() {
		System.out.println("Title Second:"+driver.getTitle());
	}
	
   @AfterMethod
   public void tearDown() {
	   driver.quit();
   }
}
