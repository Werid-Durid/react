package Á·Ï°1;

import java.util.Scanner;

public class Á·Ï°Ìâ1 {
	static int b1=0;
	static Scanner sc1= new Scanner(System.in);
	static int a1=sc1.nextInt();
	public static void jisuan(int a,int b) {
		
		for(;a>1;) {
			if(a%2==1) {
				b+=1;
				a=(a-1)/2 ;
			}
			else {
				a=(a)/2 ;
			}
		}
	b1=b+1;
	}

	public static void main(String[] args) {
jisuan(a1,b1);

System.out.println(b1);
	}

}
