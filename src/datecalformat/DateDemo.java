package datecalformat;

import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {

		Date d = new Date();
		System.out.println(d);
		// date month year min hour second timezone
		System.out.println(d.getDay());
		System.out.println(d.getDate());
		System.out.println(d.getMonth());
		System.out.println(d.getHours());
		System.out.println(d.getMinutes());
		// strike through --> depreciated --> alternate

		Date d1 = new Date(0);// ms -1st date = 1st jan 1970 
		System.out.println(d1);

		// ms
		System.out.println(d.getTime());

		d.setYear(89);
		d.setMonth(3);
		d.setDate(22);

		System.out.println(d);
	}

}

class AAA {

}