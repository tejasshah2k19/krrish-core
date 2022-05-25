package iodemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CountriesDemo {
	public static void main(String[] args) throws IOException {

		File f = new File("d://temp//country.txt");
		FileWriter fw = new FileWriter(f);
		int size;
		Scanner scr = new Scanner(System.in);
		System.out.println("How many country you want?");
		size = scr.nextInt();
		String cname = "";

		for (int i = 1; i <= size; i++) {
			System.out.println("enter country name");
			cname = scr.next();
			fw.write(cname + "\n");
		}
		fw.close();

		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		while (true) {
			cname = br.readLine(); // india usa japan null
			if (cname == null)
				break;
			else {
				if(cname.startsWith("a")) {
					
				}
			}
		
		}
		br.close();

	}
}
