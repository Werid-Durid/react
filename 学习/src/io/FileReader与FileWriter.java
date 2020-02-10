package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReader��FileWriter {
	public static void main(String[] args) {
        
		
		// д����ʹ��Stream����һ����ֻ��������ȡʱ�Ƕ�ȡ���ַ���
        FileReader fr = null;
        FileWriter fw = null;
        int len = 0;
        try {
            fr = new FileReader("C:\\Users\\DELL\\Desktop\\������\\����FileReader.txt");
            fw = new FileWriter("C:\\Users\\DELL\\Desktop\\������\\����FileReader2.txt");
            //Ϊ�����Ч�ʣ����������õ��ַ�����
            char[] buffer = new char[1024];
            //�߶���д
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
