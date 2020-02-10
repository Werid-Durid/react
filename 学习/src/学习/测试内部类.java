package 学习;

public class 测试内部类 {

}
class 外部类{
	private int age=10;
	public void testout() {
		
	}
	class inter{
		public void show() {
			System.out.println("外部类的成员变量是"+外部类.this.age);
		}
	}
}
