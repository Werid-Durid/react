package ѧϰ;

import java.io.File;

public class �ļ�·������ {
	public static void main(String[] args) {
		String lujin="C:\\Users\\DELL\\Desktop\\һЩ�ʼ�";
		File f=new File(lujin);
		if(f.isDirectory()) {
			System.out.println("Ŀ¼�ǣ�"+lujin);
		String s[]=f.list();
		for(int i=0;i<s.length;i++) {
			File details=new File(lujin+"/"+s[i]);
            if (details.isDirectory()) {
                System.out.println(s[i] + " ��һ��Ŀ¼");
            } else {
                System.out.println(s[i] + " ��һ���ļ�");
            }			
		}
		
		}
		else {
            System.out.println(lujin + " ����һ��Ŀ¼");
        }
		
	
	}
}
