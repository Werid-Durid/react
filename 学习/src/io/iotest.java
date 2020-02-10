package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class iotest {

	public static void main(String[] args) {
        //初始化
		FileInputStream fis =null;
		try {		
			
			
			//覆盖了子类的方法
			InputStream input23=new FileInputStream("C:\\Users\\DELL\\Desktop\\测试用\\测试io流.txt") {
				public int read() throws IOException {
					return 23232323;
					
				};
			};
			System.out.println(input23.read());
			
			
			
			//主要内容
			fis=new FileInputStream("C:\\Users\\DELL\\Desktop\\测试用\\测试io流.txt");
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
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(fis!=null) {
					//保证数据流的关闭
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
		//单个字符的读取
//		try {
//			FileInputStream fis =new FileInputStream("C:\\Users\\DELL\\Desktop\\测试用\\测试io流.txt");
//			int s1=fis.read();
//			int s2=fis.read();
//			int s3=fis.read();
//			int s4=fis.read();
//			System.out.println(s1);		//1
//			System.out.println(s2);    //空格     
//			System.out.println(s3);   //2
//			System.out.println(s4);  //空格 
//			
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
		
	
	

	
	
	
	

