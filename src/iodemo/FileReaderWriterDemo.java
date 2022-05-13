package iodemo;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {

	public static void main(String[] args) throws IOException {

		File f = new File("d://temp//names.txt");
		// f.createNewFile();

		// when we write data into file , file will create
		// if not present then create it
		// if present then over writer

		FileWriter fw = new FileWriter(f);
		fw.write("royal education");
		fw.close();

		FileReader fr = new FileReader(f);
		char c[] = new char[(int) f.length()];
		fr.read(c);

		for (char x : c) {
			System.out.println(x);
		}

		fr.close();

	}
}
