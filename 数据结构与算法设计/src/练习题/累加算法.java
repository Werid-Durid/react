package 练习题;
public class 累加算法 {
	

//	计算1/4的i次方乘以i累加
	public static double leijia(int x) {
		double sum=0;
		double j=1;
		int k=x;
		while(x>0) {
			j=j*0.25;
			sum+=j*(k-x+1);
			x--;
		}
		return sum;
	}
	
//	计算累加1/4的i次方累加
	public static double leijia2(int x) {
		double sum=0;
		double j=1;
		while(x>0) {
			j=j*0.25;
			sum+=j;
			x--;
		}
		return sum;
	}
	
	
	public static double leijia3(int x) {
		double sum=0;
		double j=1;
		int k=x;
		while(x>0) {
			j=j*0.25;
			sum+=j*(k-x+1)*(k-x+1);
			x--;
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
	  System.out.println(leijia(15));
	  System.out.println(leijia2(15));
	  System.out.println(leijia3(50));
	}
}
