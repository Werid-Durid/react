package ѧϰ;

public class �����Զ�װ�� {
	public static void main(String[] args) {
		Integer a1=new Integer(23);
		//�Զ�װ��
		Integer a2 =23;//Integer a=Integer.valueOf(23);
		//�Զ�����
		int b=a1;//��������ת�� int b=a.intValue();
		
		
		
//		����
//		Integer c=null;
//		int d=c;���䣬�Զ����� c.intValue();
		
		//����{-128��127}֮������ֵ�ʱ�򣬴�����{-128��127}֮���һ���������顣
		//�����ǵ���ValueOf()��ʱ�����ȼ���Ƿ���{-128,127}֮�䣬����������Χ��ֱ�Ӵ���������������ó��Ѿ����õĶ���
		//������������Χ���򴴽��µ�Integer����
		
		Integer int1=Integer.valueOf(-120);
		
		Integer int2=-120;
		
		System.out.println(int1==int2);
		
		System.out.println(int1.equals(int2));
		
		System.out.println("###########");
		
		
		Integer int3=1200;
		
		Integer int4=1200;
		//���ڻ���������
		System.out.println(int3==int4);
		
		System.out.println(int3.equals(int4));
		
	}
}
