package datecalformat;

import java.util.Calendar;
import java.util.Date;

public class CalDemo {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		System.out.println(c);
		System.out.println(c.get(Calendar.MONTH));

		// 30 day

		// 1st payment 25-april-2022
		// 30th
		//

		// 1st param is constant for field [ DATE,HOUR,MINUTES,MONTH,YEAR....]
		// 2nd param is value for increment how many values you want to add in field
		// [1st param]
		c.roll(Calendar.DATE, 30);// add 30 days but do not change month
		// change only day
		// so roll method just adding the given parameter and does not change the
		// other field values
		// add method will add given parameter and also change
		// other fileds on basis of given parameter.

		// .eg -> if we add 15 hrs and current time is 2 pm then
		// add method will change date and make it next date/day
		// roll method just add the hrs and does not change date/day

		// same apply for day and month

		System.out.println(c);//
		Date d1 = new Date(c.getTimeInMillis());
		System.out.println(d1);

		c.roll(Calendar.HOUR, 30);// add 30 hours

	}
}
