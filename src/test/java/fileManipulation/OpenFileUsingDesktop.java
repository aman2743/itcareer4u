package fileManipulation;

import java.awt.Desktop;
import java.io.File;

public class OpenFileUsingDesktop {
	public static void main(String[] args) {
//		Store file path in a String variable
		String path="C:\\Users\\Aman\\eclipse-workspace2\\itcaree4u\\TestFile123.txt";
		try {
//			Create file object and need to pass the path of file to open.
//			import the package java.io.File
			File file=new File(path);
//			Desktop - Is a class represents an action type.  Each platform supports 
//			a different set of actions
//			isDesktopSupported - Tests whether this class is supported on the 
//			current platform. Returns boolean value
			if(!Desktop.isDesktopSupported()) {
				System.out.println("Desktop Not supported");
				return;
			}
//			getDesktop - Returns the instance of the current desktop context
			Desktop desktop=Desktop.getDesktop();
			if(file.exists()) {
				desktop.open(file);
//				desktop.print(file);
//				desktop.mail();
//				desktop.edit(file);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
