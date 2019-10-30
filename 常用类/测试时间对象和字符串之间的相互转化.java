package 常用类;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author tsy
 * DateFormat和SimpleDateFormat的区别
 *
 */
public class 测试时间对象和字符串之间的相互转化 {
	public static void main(String[] args) throws ParseException {
		
		
		DateFormat df =new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String str=df.format(new Date(40000));
		System.out.println(str);
		
		
		DateFormat df2 =new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date =df.parse("1970-01-01 08:00:40");
		System.out.println(date);
	}

}
