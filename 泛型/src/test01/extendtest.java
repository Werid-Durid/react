package test01;

import java.util.ArrayList;
import java.util.List;

public class extendtest {
	public static void main(String[] args) {
		test<test01> t1=new test<test01>();
		test<t1> ta=new test<t1>();
		test<t2> tb=new test<t2>();
		test<t3> tc=new test<t3>();
		
		
		List<? extends test01> list01=new ArrayList<t1>();
		Test(list01);
		
		
		System.out.println(123);
	}
	
	
	public static void Test(List<? extends test01> list) {
		
	}
	
	
	static class test<t extends test01>{
		
	}
}
