package FristTest;



public class jiechen {
	public static void main(String[] args) {
		int sum=0;
		for(int x=1;x<=3;x++) {
			int i=x;
			int sum2=1;
			for(;i>0;i--) {
				sum2*=i;
			}
			sum+=sum2;
			
		}
		System.out.println(sum);
	}
}
