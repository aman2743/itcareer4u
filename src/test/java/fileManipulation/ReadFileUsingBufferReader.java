package fileManipulation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileUsingBufferReader {
	public static void main(String[] args) {
//		Store file path in a String variable
		String path = "C:\\Users\\Aman\\eclipse-workspace2\\itcaree4u\\TestFile.txt";
		BufferedReader br = null;
		try {
			File file=new File(path);
			FileReader reader=new FileReader(file);
			br=new BufferedReader(reader);
			System.out.println("File Content is here:");
			int counter=0;
			while((counter=br.read())!=-1){
				System.out.print((char)counter);
			}
           
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
			} catch (IOException e2) {
			e2.printStackTrace();
			}
		}
	}
}
