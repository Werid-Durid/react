package 学习;

import java.util.Arrays;

public class 二分法查找 {
	public static void main(String[] args) {
		int[] a= {30,60,52,4,9,265,46};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int value=30;
		System.out.println(chazhao(a,value));
		
		
		

		}
	
public static int chazhao(int[] a,int value) {
		int low=0;
		int high=a.length-1;
		while(low<=high){
			int mid=(high+low)/2;
			if (value==a[mid]) {
				return mid;
				
				
			}
			if((value>a[mid])) {
				low=mid+1;
				
			}
			else {
				high=mid-1;
				
			}
			
		}
		return -1;
		
		
}
}