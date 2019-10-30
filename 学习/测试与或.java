package 学习;

public class 测试与或 {
	public static void main(String[] args) {
		System.out.println(test());
	}
	//测试与或
	public static String test() {
		String a=(11!=1)&&(3==1)?"或":"与";
		String b=(11!=1)||(3==1)?"或":"与";
		
		return "&&是"+a+"\t||是"+b;
	}
}
