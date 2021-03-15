package demo2;
import java.io.File;
import java.io.FileWriter;

public class Write {
		public static void main(String args[]) {
			try {
				FileWriter f1=new FileWriter("Abc.txt");
				f1.write("Hellow Everyone");
				f1.close();
				System.out.println("File written Successfully");
				}
			catch(Exception e) {
				e.getStackTrace();
			}
		}

	}

