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
		
		//ArrayList:底层实现是数组，查询快。删除，插入和修改慢。
		//LinkedList：底层实现是链表，查询慢。删除，插入和修改快。
		//Vector：线程安全，效率低。
		List.add("aaa");
		List.add(new Date());
		List.add(1234); //自动装箱！
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