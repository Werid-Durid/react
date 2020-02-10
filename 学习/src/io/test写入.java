package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class test写入 {
	 public static void main(String[] args) {
	        FileOutputStream fos = null;
	        FileInputStream fis=null;
	        String string = "这是添加的内容";
	        try {
	            // true表示内容会追加到文件末尾；false表示重写整个文件内容。
	            fos = new FileOutputStream("C:\\Users\\DELL\\Desktop\\测试用\\测试io流.txt", true);
	            //该方法是直接将一个字节数组写入文件中; 而write(int n)是写入一个字节
	            fos.write(string.getBytes());
	            fis=new FileInputStream("C:\\\\Users\\\\DELL\\\\Desktop\\\\测试用\\\\测试io流.txt");
	            
	            		
	            
	            
	            
				StringBuilder sb=new StringBuilder();
				int temp=0;

				//当temp等于-1时表示读取到文件末尾
				while((temp=fis.read())!=-1) {
					if(temp==32) {
						sb.append("空格");
						continue;
					}
					
					sb.append((char) temp);
					
				}
				
				System.out.println(sb);
	        
	        //常见的catch块和finally区域
				
			//相继关闭输入流和输出流
				//finally区域拥有继承区
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
