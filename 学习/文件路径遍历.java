package 学习;

import java.io.File;

public class 文件路径遍历 {
	public static void main(String[] args) {
		String lujin="C:\\Users\\DELL\\Desktop\\一些笔记";
		File f=new File(lujin);
		if(f.isDirectory()) {
			System.out.println("目录是："+lujin);
		String s[]=f.list();
		for(int i=0;i<s.length;i++) {
			File details=new File(lujin+"/"+s[i]);
            if (details.isDirectory()) {
                System.out.println(s[i] + " 是一个目录");
            } else {
                System.out.println(s[i] + " 是一个文件");
            }			
		}
		
		}
		else {
            System.out.println(lujin + " 不是一个目录");
        }
		
	
	}
}
