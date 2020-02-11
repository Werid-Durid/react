package tests;

public class ten8 {
	public static void main(String[] args) {
		sum8();
	}
	public static void sum8() {
		long a=8,sum=0;
		for(int num = 0;num<10;num++) {
			sum+=a;
			a=10*a+8;
		}
		System.out.println(sum);
	}
}
