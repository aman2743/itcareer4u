package fileManipulation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileUsingFileInputStream {
	public static void main(String[] args) {
//		Store file path in a String variable
		String path="C:\\Users\\Aman\\eclipse-workspace2\\itcaree4u\\TestFile.txt";
		FileInputStream fis = null;
		try {
//			create file object
			File file=new File(path);
//			pass this file instance to file input stream
			fis=new FileInputStream(file);//connection has been established
			int counter;
//			read():Reads a byte of data from this input stream. This method blocks if no input is yet available.
//			read():return the next byte of data, or -1 if the end of the file is reached.
//			read():public int read() - returns the integer value
			System.out.println("File Content is here:");
			while((counter=fis.read())!=-1){
				System.out.print((char)counter);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
