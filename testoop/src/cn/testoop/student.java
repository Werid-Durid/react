package cn.testoop;

import java.util.Scanner;

public class student {
	private String name;
	static int id;
	static int age;
	String gender;
    int weith;
	
    
    
    public static void study() {
    	id=1;
    	System.out.println(id);
    }
    public static void main(String[] args) {
		study();
		Scanner sc= new Scanner(System.in);
		age=sc.nextInt();
		System.out.println(age+"ÄêÁä");
		
	}
}
	