package 学习;

public class 测试自动装箱 {
	public static void main(String[] args) {
		Integer a1=new Integer(23);
		//自动装箱
		Integer a2 =23;//Integer a=Integer.valueOf(23);
		//自动拆箱
		int b=a1;//编译器会转成 int b=a.intValue();
		
		
		
//		报错
//		Integer c=null;
//		int d=c;拆箱，自动调用 c.intValue();
		
		//缓存{-128，127}之间的数字的时候，创建了{-128，127}之间的一个缓存数组。
		//当我们调用ValueOf()的时候，首先检查是否在{-128,127}之间，如果在这个范围则直接从这个缓存数组中拿出已经建好的对象
		//如果不在这个范围，则创建新的Integer对象
		
		Integer int1=Integer.valueOf(-120);
		
		Integer int2=-120;
		
		System.out.println(int1==int2);
		
		System.out.println(int1.equals(int2));
		
		System.out.println("###########");
		
		
		Integer int3=1200;
		
		Integer int4=1200;
		//不在缓存区域内
		System.out.println(int3==int4);
		
		System.out.println(int3.equals(int4));
		
	}
}
