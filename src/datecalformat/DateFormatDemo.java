package datecalformat;

import java.text.DateFormat;
import java.util.Date;

public class DateFormatDemo {
	public static void main(String[] args) {

		// now i want to print date in particular format
		Date dx = new Date();
		System.out.println(dx);// Tue May 10 14:28:38 IST 2022

		// we need multiple format for date for different different purpose
		// e.g of format
		// 10-May-2022
		// 10-02-2022
		// 10-02-22
		// 10 May 2022 , Tuesday
		// etc

		// to convert your date into other format or to change date format
		// we have DateFormat Abstract class

		DateFormat df = DateFormat.getDateInstance();
		// we can't use new keyword as it is abstract class

		// to convert date into other format we have format method

		String f1 = df.format(dx); // we just pass date object in format method and
		// it will return default DateFormat
		System.out.println(f1);

		// short
		df = DateFormat.getDateInstance(DateFormat.SHORT);
		f1 = df.format(dx);
		System.out.println("short => " +f1);

		// medium
		df = DateFormat.getDateInstance(DateFormat.MEDIUM);
		f1 = df.format(dx);
		System.out.println("medium => " +f1);

		// long
		df = DateFormat.getDateInstance(DateFormat.LONG);
		f1 = df.format(dx);
		System.out.println("long => " +f1);

		// full
		df = DateFormat.getDateInstance(DateFormat.FULL);
		f1 = df.format(dx);
		System.out.println("full => " +f1);


		System.out.println("------------------------------------");
		
		
		// short
		df = DateFormat.getTimeInstance(DateFormat.SHORT);
		f1 = df.format(dx);
		System.out.println("short => " +f1);

		// medium
		df = DateFormat.getTimeInstance(DateFormat.MEDIUM);
		f1 = df.format(dx);
		System.out.println("medium => " +f1);

		// long
		df = DateFormat.getTimeInstance(DateFormat.LONG);
		f1 = df.format(dx);
		System.out.println("long => " +f1);

		// full
		df = DateFormat.getTimeInstance(DateFormat.FULL);
		f1 = df.format(dx);
		System.out.println("full => " +f1);

	
	}
}
