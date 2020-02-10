package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ���Ի����� {
    public static void main(String[] args) {
        // ʹ�û����ֽ���ʵ�ָ���
        long time1 = System.currentTimeMillis();
        copyFile1("C:\\Users\\DELL\\Desktop\\������\\���Ի��帴��3.txt","C:\\Users\\DELL\\Desktop\\������\\���Ի��帴��4.txt");
        long time2 = System.currentTimeMillis();
        System.out.println("�����ֽ������ѵ�ʱ��Ϊ��" + (time2 - time1));
 
        // ʹ����ͨ�ֽ���ʵ�ָ���
        long time3 = System.currentTimeMillis();
        copyFile2("C:\\Users\\DELL\\Desktop\\������\\���Ի��帴��1.txt","C:\\Users\\DELL\\Desktop\\������\\���Ի��帴��2.txt" );
        long time4 = System.currentTimeMillis();
        System.out.println("��ͨ�ֽ������ѵ�ʱ��Ϊ��" + (time4 - time3));
    }
    /**�����ֽ���ʵ�ֵ��ļ����Ƶķ���*/
    static void copyFile1(String src, String dec) {
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        int temp = 0;
        try {
            fis = new FileInputStream(src);
            fos = new FileOutputStream(dec);
            //ʹ�û����ֽ�����װ�ļ��ֽ��������ӻ��幦�ܣ����Ч��
            //�������Ĵ�С����������ĳ��ȣ�Ĭ����8192��Ҳ�����Լ�ָ����С
            
//            DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(fos));
//            dos.writeUTF("23564646464");
            
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);
            while ((temp = bis.read()) != -1) {
                bos.write(temp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //ע�⣺���Ӵ�������ע�����Ĺر�˳�򣡡��󿪵��ȹرգ���
            try {
                if (bos != null) {
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bis != null) {
                    bis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
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
    /**��ͨ����ʵ�ֵ��ļ����Ƶķ���*/
    static void copyFile2(String src, String dec) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        int temp = 0;
        try {
            fis = new FileInputStream(src);
            fos = new FileOutputStream(dec);
            while ((temp = fis.read()) != -1) {
                fos.write(temp);
            }
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
