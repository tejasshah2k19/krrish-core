package niod;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.util.Calendar;
import java.util.Date;

public class ReadAttributesDemo {

	public static void main(String[] args) throws IOException {

		Calendar c = Calendar.getInstance();
		c.set(Calendar.MONTH, 0);
		c.set(Calendar.DATE, 1);
		// now get milliseconds from c which is 1st jan 2022
		long ms = c.getTimeInMillis();// 1st jan 2022

		Date d = new Date(ms);
		System.out.println(d);// 1st jan 2022

		File f = new File("d://temp//country.txt");
		f.setLastModified(ms);
		System.out.println(f.lastModified());
		Path p = Paths.get("d://temp//country.txt");

		FileTime ft = FileTime.fromMillis(ms);
		Files.setLastModifiedTime(p, ft);
		System.out.println(Files.getLastModifiedTime(p));
	}
}
