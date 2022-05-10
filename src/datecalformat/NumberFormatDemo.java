package datecalformat;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {
	public static void main(String[] args) {

		float amount = 100.1234f;
		Locale l = new Locale("fr");
		
		System.out.println(amount);
		NumberFormat nf = NumberFormat.getInstance();
		System.out.println("default => "+nf.format(amount));
		
		
		nf = NumberFormat.getInstance(l);
		System.out.println("fr => "+nf.format(amount));
		
 		NumberFormat c = NumberFormat.getCurrencyInstance(); 
		System.out.println("default = > "+c.format(amount));
		
		l = new Locale("fr");		
		c = NumberFormat.getCurrencyInstance(l); 
		System.out.println("fr = > "+c.format(amount));
		
		l = new Locale("en","US");		
		c = NumberFormat.getCurrencyInstance(l); 
		System.out.println("us = > "+c.format(amount));
		
	}
}
