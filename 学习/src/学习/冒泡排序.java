package —ßœ∞;

import java.util.Arrays;

public class √∞≈›≈≈–Ú {
	public static void main(String[] args) {
		int[] shuzu= {1,6,8,12,64,45};
		int temp=0;
		
	for(int i=0;i<shuzu.length-1;i++) {
		
		for(int j=0;j<shuzu.length-1-i;j++) {
			
			
			if(shuzu[j]>shuzu[j+1]) {
				temp=shuzu[j];
				shuzu[j]=shuzu[j+1];
				shuzu[j+1]=temp;
				
			}
			
			
			
//			for(int k=1;k<shuzu.length-j;)
		}
		System.out.println(Arrays.toString(shuzu));
	}
	
	}

}
