package ѧϰ;

public class �������鿽�� {
	public static void main(String[] args) {
//		jisuan();
//		String[] s2= {"a","v","c"};
//		shanchu(s2,2);
		kuochon();
	}
	public static void jisuan() {
		String[] s1= {"a","v","c"};
		String[] s2=new String[20];
		
		//�������飬����������ʼλ�ã�Ŀ��λ�ã�Ŀ��������ʼλ�ã���������
		System.arraycopy(s1,0,s2,0,3);
//		System.out.println(s2);
		for(int i=0;i<s2.length;i++)
		{
			System.out.println(i+"---"+s2[i]);
		}
	}
	//ɾ��ָ��λ�õ�Ԫ��
	public static String[] shanchu(String[] s,int index) {
		//�������飬����������ʼλ�ã�Ŀ��λ�ã�Ŀ��������ʼλ�ã���������
		System.arraycopy(s,index,s,index-1,s.length-index);
//		System.out.println(s2);
		s[s.length-1]=null;
		for(int i=0;i<s.length;i++)
		{
			System.out.println(i+"---"+s[i]);
		}
		return s;
	}
	
	public static void kuochon() {
		String[] s1= {"a","s","d"};
		String[] s2=new String[s1.length+10];
		System.arraycopy(s1, 0, s2, 0, s1.length);
		
		for(String x:s2) {
			System.out.println(x);
		}
	}
	
	
	
	
	
	
	
	
	
	
}
