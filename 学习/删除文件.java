package ѧϰ;

import java.io.File;

public class ɾ���ļ� {
	public static void main(String[] args) {
		//·��������
		String lujin="C:\\Users\\DELL\\Desktop\\������\\����ר��\\�½��ļ���";
		//��Ҫע�����ļ�Ҳ�ᱻɾ��
		File f=new File(lujin);
		
		deletewenjianjia(f);
		
	}

	
	//������
	public static void deletewenjianjia(File f) {
		File[] fdetails=f.listFiles();
		if(fdetails!=null) {
			for(File f1:fdetails) {
				if(f1.isDirectory()) {
					//�ݹ�
					deletewenjianjia(f1);
					
				}else {
					f1.delete();
					
					//����ɾ���ɹ����
					System.out.println(f1+"ɾ���ɹ�!");
				}
				
			}
		}
		//���ɾ�����ļ�
		f.delete();
	}
	
}
