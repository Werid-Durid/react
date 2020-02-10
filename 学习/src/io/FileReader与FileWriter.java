package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReader与FileWriter {
	public static void main(String[] args) {
        
		
		// 写法和使用Stream基本一样。只不过，读取时是读取的字符。
        FileReader fr = null;
        FileWriter fw = null;
        int len = 0;
        try {
            fr = new FileReader("C:\\Users\\DELL\\Desktop\\测试用\\测试FileReader.txt");
            fw = new FileWriter("C:\\Users\\DELL\\Desktop\\测试用\\测试FileReader2.txt");
            //为了提高效率，创建缓冲用的字符数组
            char[] buffer = new char[1024];
            //边读边写
            while ((len = fr.read(buffer)) != -1) {
                fw.write(buffer, 0, len);
            }
 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
	}
}
