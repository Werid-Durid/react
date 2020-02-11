package 练习题;
public class add {
	


	public static double leijia(int x) {
		double sum=0;
		double j=1;
		final int k = x;
		while (x > 0) {
			j = j * 0.25;
			sum += j * (k - x + 1);
			x--;
		}
		return sum;
	}

	public static double leijia2(int x) {
		double sum = 0;
		double j = 1;
		while (x > 0) {
			j = j * 0.25;
			sum += j;
			x--;
		}
		return sum;
	}

	public static double leijia3(int x) {
		double sum = 0;
		double j = 1;
		final int k = x;
		while (x > 0) {
			j = j * 0.25;
			sum += j * (k - x + 1) * (k - x + 1);
			x--;
		}
		return sum;
	}

	public static void main(final String[] args) {
	  System.out.println(leijia(15));
	  System.out.println(leijia2(15));
	  System.out.println(leijia3(50));
	}
}
