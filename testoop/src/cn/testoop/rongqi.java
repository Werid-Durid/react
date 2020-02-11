package cn.testoop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class rongqi implements jiekou {	
		Collection c;
		@Override
		public void book() {
			System.out.println("book"+"         "+b);
		}
		static rongqi s=new rongqi();
		public static void main(String[] args) {
		List<Object> List=new ArrayList();
		
		//ArrayList:�ײ�ʵ�������飬��ѯ�졣ɾ����������޸�����
		//LinkedList���ײ�ʵ������������ѯ����ɾ����������޸Ŀ졣
		//Vector���̰߳�ȫ��Ч�ʵ͡�
		List.add("aaa");
		List.add(new Date());
		List.add(1234); //�Զ�װ�䣡
		List.add(new dog());
		
		System.out.println(List.size());
		
		List<Object> List2= new ArrayList<Object>();
		List2.add("bbb");
		List2.add("ccc");
		List.add(List2);
		
		s.book();
		}

}
class dog{
	
}