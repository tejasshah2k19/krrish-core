package iodemo;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {
	static Scanner scr = new Scanner(System.in);

	static void first() throws IOException {
		// c c++
		// file operation
		// new file , remove file
		// file size , attribute - hide , read only

		File f = new File("demo.txt");// this will not create new file
		boolean x = f.createNewFile();// this will create file if file is not present and return true
		// return false if file not created
		System.out.println("created => " + x);
		f = new File("d://temp//demo.txt");// this will not create new file
		x = f.createNewFile();// this will create file if file is not present and return true
								// return false if file not created
		System.out.println("created 2 => " + x);
		System.out.println("done...");

	}

	public static void takePathAndCreateFile() throws IOException {
		System.out.println("Enter file path");
		String path = scr.next();
		System.out.println("Enter file name");
		String fileName = scr.next();

		File f = new File(path, fileName);

		f.createNewFile();

	}

	static void checkFilePresent() {
		System.out.println("Enter file path");
		String path = scr.next();
		System.out.println("Enter file name");
		String fileName = scr.next();
		File f = new File(path, fileName);

		boolean x = f.exists(); // true if file present , false if file not present
		if (x) {
			System.out.println("File present ");
			System.out.println("total bytes => " + f.length());
		} else {
			System.out.println("File not Present");
		}

	}

	static void checkFilePresentAndRemove() {
		System.out.println("Enter file path");
		String path = scr.next();
		System.out.println("Enter file name");
		String fileName = scr.next();
		File f = new File(path, fileName);

		boolean x = f.exists(); // true if file present , false if file not present
		if (x) {
			f.delete();// remove and return true
						// false
			System.out.println("File deleted...");
		} else {
			System.out.println("File not Present");
		}

	}

	public static void main(String[] args) throws IOException {
//		takePathAndCreateFile();
		checkFilePresent();
//		checkFilePresentAndRemove();
	}
}
