package niod;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesPathsPathDemo {

	public static void main(String[] args) throws IOException {

		// io
		File f = new File("d://temp//a.txt");
		System.out.println(f.exists());
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		f.delete();

		// nio
		Path p = Paths.get("d://temp//b.txt");
		System.out.println(Files.exists(p));
		try {
			Files.createFile(p);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			Files.delete(p);
		} catch (IOException e) {
			e.printStackTrace();
		}

	
	
		Path d= Paths.get("d://temp//test123//test455");
//		Files.createDirectory(d);
		Files.createDirectories(d);
	
	}
}
