package PackagePractice;

import java.io.BufferedReader;
import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileOperations {

	public static void main(String[] args) {
		file f  = new file();
		try {
			f.fileOperations();
		} 
		catch (IOException e) {
			System.out.println("exception occured");
			e.printStackTrace();
		}


	}

}

class file
{
	void fileOperations() throws IOException
	{
		//		Scanner sc= new Scanner(System.in);
		//		System.out.println("Enter a line to insert in a file : ");
		//		String ss = sc.nextLine();
		//		System.out.println(ss);
		//
		//		File ff = new File("D:\\selenium_Class\\Core Java\\fileNew.txt");
		//		FileWriter fw = new FileWriter(ff);
		//		fw.write("ddd");
		//		System.out.println("data in file : ");
		//		Scanner scff = new Scanner(ff);
		//		String ffdata;
		//		while(scff.hasNext())
		//		{
		//			ffdata = scff.nextLine();
		//			System.out.println(ffdata);
		//		}
		//		System.out.println(ffdata);

		String fileContent = "Hello Learner !! Welcome to howtodoinjava.com.";

		BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\selenium_Class\\Core Java\\ff\\fileNew.txt"));
		writer.write(fileContent);
		writer.close();

		//	    BufferReader reader = new BufferedReader();
		String fileContent1;
		Scanner scc = new Scanner(System.in);
		System.out.println("enter data in a file : ");
		fileContent1 = scc.nextLine();
		File ff = new File("D:\\selenium_Class\\Core Java\\ff\\fileNew1.txt");
		FileWriter fileWriter = new FileWriter(ff);
		fileWriter.write(fileContent1);
		fileWriter.close();

		Scanner sc = new Scanner(ff);
		String ss1 = sc.nextLine();
		System.out.println("you entered : "+ss1+" in the file. ");

	}


}


