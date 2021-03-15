package demo2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class FileHandling4 {
	public static void main(String args[]) {
		//Scanner sc=new Scanner(System.in);
		try {
			File file=new File("C:\\Users\\logv2c18460\\eclipse-workspace\\JavaCode1\\Logi1.txt");
			file.createNewFile();
			System.out.println("File Created Successfully");
			FileWriter f1=new FileWriter("C:\\Users\\logv2c18460\\eclipse-workspace\\JavaCode1\\Logi1.txt");
			BufferedWriter info=new BufferedWriter(f1);
			
			info.write("I want to write three lines");
			info.newLine();
			info.write("Hello Everyone, Good morning");
			info.newLine();
			info.write("How are you");
			info.close();
			System.out.println("File Written Successfully");
		}
		catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		try {
			File file1=new File("C:\\Users\\logv2c18460\\eclipse-workspace\\JavaCode1\\Priya.txt");
			file1.createNewFile();
			System.out.println("Priya File Created Successfully");
			Scanner sc=new Scanner(System.in);
			if(file1.length()==0) {
			file1.delete();
					}
			System.out.println("Empty priya  File deleted Successfully");
		}
		catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
		try {
		File file2=new File("C:\\Users\\logv2c18460\\eclipse-workspace\\JavaCode1\\Priya.txt");
		if(!file2.exists())
		{
			throw new FileNotFoundException();
		}
		}
		catch(FileNotFoundException e) {
			System.out.println("File not Exists");
			e.printStackTrace();
		}
	}
}


