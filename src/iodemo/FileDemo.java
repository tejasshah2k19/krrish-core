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

	static void createFolder() throws IOException {
		System.out.println("Enter folder path");
		String path = scr.next();
		System.out.println("Enter folder name");
		String folderName = scr.next();
		File f = new File(path, folderName);

		f.mkdir();
		// we can use exists delete length
		// for delete folder must be empty

		System.out.println("Enter file name");
		String fileName = scr.next();

		File f1 = new File(f, fileName);
		f1.createNewFile();

	}

	static void listAllFilesFromFolder() {
		System.out.println("Enter directory that you want to list");
		String path = scr.nextLine();

		File f2 = new File(path);

		String listOfFiles[] = f2.list();
		for (String s : listOfFiles) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) throws IOException {
//		takePathAndCreateFile();
//		checkFilePresent();
//		checkFilePresentAndRemove();
//		createFolder();
		listAllFilesFromFolder();
	}
}
