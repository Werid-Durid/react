package ������;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author tsy
 * DateFormat��SimpleDateFormat������
 *
 */
public class ����ʱ�������ַ���֮����໥ת�� {
	public static void main(String[] args) throws ParseException {
		
		
		DateFormat df =new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String str=df.format(new Date(40000));
		System.out.println(str);
		
		
		DateFormat df2 =new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date =df.parse("1970-01-01 08:00:40");
		System.out.println(date);
	}

}
