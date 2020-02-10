package 常用类;

import java.util.Date;

public class 测试Date类 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Date d=new Date();
		Date d2=new Date(2000);
		System.out.println(d.toLocaleString());
		System.out.println(d2.toLocaleString());
		
		//以后使用日期都用Canlendar类
		
	}

}
