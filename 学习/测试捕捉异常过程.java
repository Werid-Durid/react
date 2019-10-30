package 学习;

public class 测试捕捉异常过程 {
	public static void main(String[] args) {
		try {
			int a[]=new int[3];
			System.out.println("输出超越数组长度的数："+a[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
			 System.out.println("数据异常，长度异常，具体异常:"+e);
			
		}
	}

}
