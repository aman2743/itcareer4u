package fileManipulation;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileUsingFileReader {
	public static void main(String[] args) {
//	Store file path in a String variable
		String path = "C:\\Users\\Aman\\eclipse-workspace2\\itcaree4u\\TestFile.txt";
		FileReader fr = null;
		try {
			fr = new FileReader(path);
			System.out.println("File Content is here:");
			int counter = 0;
			while ((counter = fr.read()) != -1) {
				System.out.print((char) counter);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
