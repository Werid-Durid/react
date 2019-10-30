package ≥£”√¿‡;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ≤‚ ‘hashmap {
	
	public static void main(String[] args) {
		System.out.println(max(1,4)); 
		Map<Integer,String> m1=new HashMap<Integer,String>();
		m1.put(1, "one");
	
		m1.put(3, "three");		
		m1.put(2, "two");
		Set<Integer> ss=m1.keySet();
//		Iterator<String> s=new Iterator();
		Iterator<Integer> e=ss.iterator();
		
		
		
		
	}
	
	
	public static int max(int a ,int b) {
		return a>b?a:b;
	}
}
