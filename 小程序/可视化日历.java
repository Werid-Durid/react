package С����;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class ���ӻ����� {
	public static void main(String[] args) throws ParseException {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
//		
//		String str="2019-10-20";
		
		DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		

		
		System.out.println("�밴�ո�ʽ�������ڣ�2019-9-20����");
		Calendar c =new GregorianCalendar();

		int days=c.get(Calendar.DAY_OF_MONTH);		
		String inputstr=sc.nextLine();
		Date date=df.parse(inputstr);		
//		Date date=df.parse(str);				
		c.setTime(date);
		int days2=c.get(Calendar.DAY_OF_MONTH);
		System.out.println("��������ʱ�������");
		System.out.println("��\tһ\t��\t��\t��\t��\t��");

		
		c.set(Calendar.DAY_OF_MONTH,1);		
		for(int i=0;i<c.get(Calendar.DAY_OF_WEEK)-1;i++) {
			System.out.print("\t");
		}

		for (int i = 1; i <= 31; i++) {
			if(c.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY) {
			System.out.println();
			
			}
			
		System.out.print(((c.get(Calendar.DAY_OF_MONTH)==days2)?c.get(Calendar.DAY_OF_MONTH)+"*":(c.get(Calendar.DAY_OF_MONTH)))+"\t");
		
		c.add(Calendar.DAY_OF_MONTH, 1);
		
		if(c.get(Calendar.DAY_OF_MONTH)==1) {
			break;
		}
		}
		
	}

}
