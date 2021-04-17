package demo2;

import java.io.File;
import java.util.Scanner;

public class Read {
	public static void main(String args[]) {
		try {
			File obj=new File("Abc.txt");
			Scanner sc=new Scanner(obj);
			while(sc.hasNextLine()) {
				String d=sc.nextLine();
				System.out.println(d);
				System.out.println("Successfully Completed");
			}
			sc.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}


}
