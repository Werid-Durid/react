package 常用类;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author tsy
 *
 */
public class 测试Calendar类 {

	public static void main(String[] args) {
		
		GregorianCalendar calendar =new GregorianCalendar(2000,10,9,20,30);
		
		int year=calendar.get(Calendar.YEAR);
		
		int month=calendar.get(Calendar.MONTH);
		int day=calendar.get(Calendar.DATE);
		int hours=calendar.get(Calendar.HOUR);
		int min=calendar.get(Calendar.MINUTE);
		System.out.println(year+"--"+month+"--"+day+"--"+hours+"--"+min);
	
		
		
		calendar.set(Calendar.HOUR_OF_DAY, 13);
		System.out.println(calendar.get(Calendar.HOUR));
	
		calendar.add(Calendar.MONTH, -3);
		System.out.println(calendar.get(Calendar.MONTH));
		
		long g=System.currentTimeMillis();
		System.out.println(g);
		
	}
	
	
	
}
