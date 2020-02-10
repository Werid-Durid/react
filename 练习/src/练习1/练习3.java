package Á·Ï°1;

import java.awt.Graphics;

public class Á·Ï°3 {


 
	public static void main(String[] args) {
		for(int i=123;i<=987;i++) {
			for(int j=123;j<=987;j++) {
				for(int k=123;k<=987;k++) {
					if (j==2*i&&k==3*i&&jisuan(i,j,k)) {
						System.out.println(i+" "+j+" "+k);
					}
				}
			}
		}
	}
 
 
	private static boolean jisuan(int i, int j, int k) {
		String s=i+""+j+""+k+"";
		if (s.contains("1")&&s.contains("2")&&s.contains("3")&&s.contains("4")&&s.contains("5")&&
				s.contains("6")&&s.contains("7")&&s.contains("8")&&s.contains("9")) {
			return true;
		}
		return false;
	}
 
	Graphics a;

 

}