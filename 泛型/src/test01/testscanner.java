package test01;

import java.util.Scanner;

import javax.print.attribute.standard.PrinterLocation;

/**
 * 测试scanner,如何接收键盘的输入。
 * @author DELL
 *
 */
public class testscanner {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String Str=s.nextLine();
	System.out.println(Str);
}
}
