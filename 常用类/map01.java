package 常用类;

public class map01 {
	hashmap底层实现[] table;
	int size;
	
	public map01() {
		table =new hashmap底层实现[16];//长度一般定义为2的整数幂
		
	}
	
	
	public void put(Object key,Object value) {
		
		hashmap底层实现 newjiedian=new hashmap底层实现();
		 
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
	
	//自定义的 哈希算法
	public int myhash(int v,int length) {
		System.out.println( "return:" +(v&(length-1)));
		return v&(length-1);
	}
}
