package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class testд�� {
	 public static void main(String[] args) {
	        FileOutputStream fos = null;
	        FileInputStream fis=null;
	        String string = "������ӵ�����";
	        try {
	            // true��ʾ���ݻ�׷�ӵ��ļ�ĩβ��false��ʾ��д�����ļ����ݡ�
	            fos = new FileOutputStream("C:\\Users\\DELL\\Desktop\\������\\����io��.txt", true);
	            //�÷�����ֱ�ӽ�һ���ֽ�����д���ļ���; ��write(int n)��д��һ���ֽ�
	            fos.write(string.getBytes());
	            fis=new FileInputStream("C:\\\\Users\\\\DELL\\\\Desktop\\\\������\\\\����io��.txt");
	            
	            		
	            
	            
	            
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
	        
	        //������catch���finally����
				
			//��̹ر��������������
				//finally����ӵ�м̳���
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                if (fos != null) {
	                    fos.close();
	                }
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	            try {
	                if (fis != null) {
	                    fis.close();
	                }
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	    }
}
