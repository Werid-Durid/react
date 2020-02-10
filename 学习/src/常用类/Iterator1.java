package 常用类;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator1 {
	public static void main(String[] args) {
		testiterator();
	}
	
	public static void testiterator() {
		List<String> list=new ArrayList<>();
		list.add("sd");
		list.add("sdsd");
		list.add("kkkkk");
		
		
		//使用迭代器遍历List
		for(Iterator<String> lte=list.iterator();lte.hasNext() ;) {
			String temp=lte.next();
			System.out.println(temp);
		}
		
	}
}
