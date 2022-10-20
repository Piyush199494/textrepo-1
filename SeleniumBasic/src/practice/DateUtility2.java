package practice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class DateUtility2 {

	public static void main(String[] args) {
		System.out.println(getrequireddatebasedonnoofdays("dd MM yyyy HH:mm:ss", 4));
		System.out.println(getrequireddatebasedonnoofmonths("MM/dd/yyyy", 5));
		System.out.println(getrequireddatebasedonnoofyear("yyyy MM dd HH:mm:ss", 3));
		

	}
public static String getrequireddatebasedonnoofdays(String format,int noofdays) {
	Calendar cal=Calendar.getInstance();
	cal.add(Calendar.DATE, noofdays);
	SimpleDateFormat s= new SimpleDateFormat(format);
	return s.format(new Date(cal.getTimeInMillis()));
}
public static String getrequireddatebasedonnoofmonths(String format,int noofmonths) {
	Calendar cal=Calendar.getInstance();
	cal.add(Calendar.MONTH, noofmonths);
	SimpleDateFormat s=new SimpleDateFormat(format);
	return s.format(new Date(cal.getTimeInMillis()));
}
public static String getrequireddatebasedonnoofyear(String format,int noofmonths) {
	Calendar cal=Calendar.getInstance();
	cal.add(Calendar.YEAR, noofmonths);
	SimpleDateFormat s=new SimpleDateFormat();
	return s.format(new Date(cal.getTimeInMillis()));
}
}
