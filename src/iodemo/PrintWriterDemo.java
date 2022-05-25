package iodemo;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws FileNotFoundException {
		
		PrintWriter pw = new PrintWriter("d://temp//names.txt");
		pw.println("ram");
		pw.println("shyam");
		pw.close();
	}
}
