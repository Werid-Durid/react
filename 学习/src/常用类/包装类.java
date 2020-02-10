package 常用类;

public class 包装类 {
	public static void main(String[] args) {

		//转成包装类对象
		Integer a=new Integer(3);
		
		Integer b=Integer.valueOf(30);
		
		
//		把包装类转换成基本类型
		double c= b.doubleValue();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		Integer f=Integer.parseInt("13464",10);
		System.out.println(f);
	}

}
