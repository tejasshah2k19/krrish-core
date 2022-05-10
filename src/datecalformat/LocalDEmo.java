package datecalformat;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class LocalDEmo {

	public static void main(String[] args) {

		Locale india = new Locale("hi", "in");
		Locale fr = new Locale("fr");
		Locale sz = new Locale("hi","in");
		//1,00,000
		//100,000
		//100.000
		
		
		Date dx = new Date();
		System.out.println(dx);// Tue May 10 14:28:38 IST 2022

		DateFormat df = DateFormat.getDateInstance();
		String f1 = df.format(dx); // we just pass date object in format method and
		System.out.println(f1);

		// short
		df = DateFormat.getDateInstance(DateFormat.SHORT,sz);
		f1 = df.format(dx);
		System.out.println("short => " + f1);

		// medium
		df = DateFormat.getDateInstance(DateFormat.MEDIUM,sz);
		f1 = df.format(dx);
		System.out.println("medium => " + f1);

		// long
		df = DateFormat.getDateInstance(DateFormat.LONG,sz);
		f1 = df.format(dx);
		System.out.println("long => " + f1);

		// full
		df = DateFormat.getDateInstance(DateFormat.FULL,sz);
		f1 = df.format(dx);
		System.out.println("full => " + f1);

	}
}
