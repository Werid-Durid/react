package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class iotest {

	public static void main(String[] args) {
        //��ʼ��
		FileInputStream fis =null;
		try {		
			
			
			//����������ķ���
			InputStream input23=new FileInputStream("C:\\Users\\DELL\\Desktop\\������\\����io��.txt") {
				public int read() throws IOException {
					return 23232323;
					
				};
			};
			System.out.println(input23.read());
			
			
			
			//��Ҫ����
			fis=new FileInputStream("C:\\Users\\DELL\\Desktop\\������\\����io��.txt");
			StringBuilder sb=new StringBuilder();
			int temp=0;

			//��temp����-1ʱ��ʾ��ȡ���ļ�ĩβ
			while((temp=fis.read())!=-1) {
				if(temp==32) {
					sb.append("�ո�");
					continue;
				}
				
				sb.append((char) temp);
				
			}
			
			System.out.println(sb);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(fis!=null) {
					//��֤�������Ĺر�
					fis.close();
					
				}
			}
				catch (IOException e2) {
					e2.printStackTrace();
					// TODO: handle exception
				}
			}
		}
		
		

	

			
}	
		//�����ַ��Ķ�ȡ
//		try {
//			FileInputStream fis =new FileInputStream("C:\\Users\\DELL\\Desktop\\������\\����io��.txt");
//			int s1=fis.read();
//			int s2=fis.read();
//			int s3=fis.read();
//			int s4=fis.read();
//			System.out.println(s1);		//1
//			System.out.println(s2);    //�ո�     
//			System.out.println(s3);   //2
//			System.out.println(s4);  //�ո� 
//			
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
		
	
	

	
	
	
	

