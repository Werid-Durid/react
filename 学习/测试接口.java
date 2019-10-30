package 学习;

public class 测试接口 {
	public static void main(String[] args) {
	interrun x=new six();
	x.rungame();
	
}
	
	

		

	
}
	class six implements interrun{

		public void rungame() {
			System.out.println("调用了接口并且重写了方法");
		}
	}