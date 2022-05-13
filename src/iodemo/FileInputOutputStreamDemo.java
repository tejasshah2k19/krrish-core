package iodemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamDemo {

	public static void main(String[] args) throws IOException {

		File f = new File("d://temp//names.txt");
		f.createNewFile();

		FileOutputStream fos = new FileOutputStream(f);
		fos.write('r');
		fos.write('o');
		fos.write('y');
		fos.write('a');
		fos.write('l');
		fos.close();

		FileInputStream fis = new FileInputStream(f);
		byte b[] = new byte[(int) f.length()];

		fis.read(b);

		// print -> b

//		while (true) {
//			b = fis.read();
//			if (b == -1)
//				break;
//			System.out.print((char) b);
//		}

		System.out.println("\n");

		System.out.println("done....");

	}
}
