package 学习;

public class 匿名内部类 {
	public static void main(String[] args) {
		sd sd1=new sd();
		int a=23;
		sd1.aa(a);
		
	}
}
class sd{
	public void aa(int a) {
		System.out.println(a);
	}
	
}
