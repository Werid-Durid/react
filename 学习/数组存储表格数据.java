package 学习;

import java.util.Arrays;

public class 数组存储表格数据 {
	public static void main(String[] args) {
		Object[] a1= {1001,"sjkd",19,"sd","123"};
		Object[] a2= {1001,"sjkd",18,"sd","123"};
		Object[] a3= {1001,"sjkd",17,"sd","123"};
		
		Object[][] a4= new Object[3][];
		a4[0]=a1;
		a4[1]=a2;
		a4[2]=a3;
		
		for(Object[] a:a4) {
			System.out.println(Arrays.toString(a));
		}
 	}
}
