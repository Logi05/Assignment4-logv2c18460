package demo2;

import java.io.File;

public class FileDemo {
	public static void main(String args[]) {
		File f=new File("Logi.txt");
		try {
			boolean value=f.createNewFile();
			if(value) {
				System.out.println("File Created Successfully");
			}
			else {
				System.out.println("File already exists");
			}
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}

}
