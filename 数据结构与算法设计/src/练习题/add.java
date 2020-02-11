package ��ϰ��;
public class add {
	

//	����1/4��i�η�����i�ۼ�
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
	
//	�����ۼ�1/4��i�η��ۼ�
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
