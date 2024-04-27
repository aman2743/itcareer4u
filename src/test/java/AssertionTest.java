import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionTest {
//	SoftAssert softAssert = new SoftAssert();
	@Test
	public void Test1() {
		SoftAssert softAssert1 = new SoftAssert();
		System.out.println("Open Browser");
		Assert.assertEquals(true, true, "Browser Open Successfully");

		System.out.println("Enter username");
		System.out.println("Enter password");
		System.out.println("Click on SignIn button");
		Assert.assertEquals(true, true, "User login successfully");

		System.out.println("Validation home page");
		softAssert1.assertEquals(true, false, "Title is not correct");

		System.out.println("Go to deal page");
		System.out.println("Create a deal");
		softAssert1.assertEquals(true, false, "Not able to create deal");

		System.out.println("Go to contact page");
		System.out.println("Create contact page");
		softAssert1.assertEquals(true, false, "Not able to create contact");
		softAssert1.assertAll();
	}

	@Test
	public void Test2() {
		SoftAssert softAssert2 = new SoftAssert();
		System.out.println("Logout");
		softAssert2.assertEquals(true, false, "LogOut Successfully");
		softAssert2.assertAll();
	}
}
