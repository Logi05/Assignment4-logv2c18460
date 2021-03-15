package demo2;

import java.io.File;

public class Delete {
public static void main(String args[]) {
	File obj1=new File("Logi.txt");
	if(obj1.delete()) {
		System.out.println("File Deleted Successfully");
	}
	else {
		System.out.println("Error");
	}
}
}
