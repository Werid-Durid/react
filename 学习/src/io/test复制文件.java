package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class test�����ļ�{
	public static void main(String[] args) {
		copyfile("C:\\Users\\DELL\\Desktop\\������\\���Ը����ļ�1.txt", "C:\\\\Users\\\\DELL\\\\Desktop\\\\������\\\\���Ը����ļ�2.txt");
	}
	
	static void copyfile(String src, String dec) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        //Ϊ�����Ч�ʣ����û������飡����ȡ���ֽ����ݻ��ݴ�ŵ����ֽ������У�
        byte[] buffer = new byte[1024];
        int temp = 0;
        try {
            fis = new FileInputStream(src);
            fos = new FileOutputStream(dec);
            //�߶���д
            //tempָ���Ǳ��ζ�ȡ����ʵ���ȣ�temp����-1ʱ��ʾ��ȡ����
            while ((temp = fis.read(buffer)) != -1) {
                /*�����������е�����д���ļ��У�ע�⣺д����Ƕ�ȡ����ʵ���ȣ�
                 *���ʹ��fos.write(buffer)��������ôд��ĳ��Ƚ�����1024��������
                 *����ĳ���*/
            	
                fos.write(buffer, 0, temp);
                
                //ֱ����write�������һ��byte������ȫ��д�룬�γɺܶ������
                fos.write(buffer);
            
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //��������Ҫ�ֱ�ر�
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

