package ������;

public class map01 {
	hashmap�ײ�ʵ��[] table;
	int size;
	
	public map01() {
		table =new hashmap�ײ�ʵ��[16];//����һ�㶨��Ϊ2��������
		
	}
	
	
	public void put(Object key,Object value) {
		
		hashmap�ײ�ʵ�� newjiedian=new hashmap�ײ�ʵ��();
		 
		System.out.println(newjiedian.hashCode());
		newjiedian.hash=myhash(newjiedian.hashCode(),table.length);
		newjiedian.key=key;
		newjiedian.value=value;
		newjiedian.next=null;
		
		
	}
	
	public static void main(String[] args) {
		map01 m1=new map01();
		m1.put(1,21);
		m1.put("sdfs", "sdfsdf");
		
		
	}
	
	//�Զ���� ��ϣ�㷨
	public int myhash(int v,int length) {
		System.out.println( "return:" +(v&(length-1)));
		return v&(length-1);
	}
}
