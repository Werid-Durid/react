package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class test复制文件{
	public static void main(String[] args) {
		copyfile("C:\\Users\\DELL\\Desktop\\测试用\\测试复制文件1.txt", "C:\\\\Users\\\\DELL\\\\Desktop\\\\测试用\\\\测试复制文件2.txt");
	}
	
	static void copyfile(String src, String dec) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        //为了提高效率，设置缓存数组！（读取的字节数据会暂存放到该字节数组中）
        byte[] buffer = new byte[1024];
        int temp = 0;
        try {
            fis = new FileInputStream(src);
            fos = new FileOutputStream(dec);
            //边读边写
            //temp指的是本次读取的真实长度，temp等于-1时表示读取结束
            while ((temp = fis.read(buffer)) != -1) {
                /*将缓存数组中的数据写入文件中，注意：写入的是读取的真实长度；
                 *如果使用fos.write(buffer)方法，那么写入的长度将会是1024，即缓存
                 *数组的长度*/
            	
                fos.write(buffer, 0, temp);
                
                //直接用write方法会把一个byte的数组全部写入，形成很多空区域
                fos.write(buffer);
            
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //两个流需要分别关闭
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

