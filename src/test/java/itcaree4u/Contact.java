package itcaree4u;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Contact {
	public static WebDriver driver;

	@BeforeMethod
	public void Launch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.navigate().to("https://www.itcareer4u.com/contact.html");
	}

	@Test
	public void TestContact() {
		System.out.println("Title First:"+driver.getTitle());
	}
   
}
