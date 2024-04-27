package fileManipulation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileUsingScanner {
	public static void main(String[] args) {
//		Store file path in a String variable
		String path = "C:\\Users\\Aman\\eclipse-workspace2\\itcaree4u\\TestFile.txt";
		File file = new File(path);
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			System.out.println("File contents are here:");
//			hasNextLine: Returns true if there is another line in the input of this scanner
//			nextLine: This method returns the rest of the current line, excluding any line separator at the end. 
//			The position is set to the beginning of the next line
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}
}
