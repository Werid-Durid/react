package tests;

import java.util.Scanner;

public class test11 {
	public class lianggeshu{
		int a,b=0;	
		public lianggeshu() {

		}
		
		public lianggeshu(int a) {
			this.a=a;
		}

	
	public void sc(){
	final Scanner sc1= new Scanner(System.in);
	int a=sc1.nextInt();
	sc1.close();
	this.a=a;
	}
    public float ore() {
        return b;
    }

	public void jisuan() {
		
		for(;a>1;) {
			if(a%2==1) {
				b+=1;
				a=(a-1)/2 ;
			}
			else {
				a=(a)/2 ;
			}
		}
		this.b=b+1;
	}
	}
	public static void main(String[] args) {
		test11 a1=new test11();
		lianggeshu a2=a1.new lianggeshu();
		a2.sc();
		a2.jisuan();
		System.out.println(a2.ore());

	}
}
