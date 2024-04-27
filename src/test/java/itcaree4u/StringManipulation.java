package itcaree4u;

public class StringManipulation {
	// Main driver method
	public static void main(String args[]) {
		// Custom input string
		String str = "Hello_World_Test_Selenium";
		String[] arrOfStr = str.split("_");
		for (String a : arrOfStr) {

			System.out.println(a);
		}
	}
}