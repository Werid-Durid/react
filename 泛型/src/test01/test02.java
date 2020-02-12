package test01;

import java.util.ArrayList;
import java.util.List;

public class test02{
	public static void main(final String[] args) {
		// final test<test01> t1 = new test<test01>();
		// final test<t1> ta = new test<t1>();
		// final test<t2> tb = new test<t2>();
		// final test<t3> tc = new test<t3>();

		final List<? extends test01> list01 = new ArrayList<t1>();
		Test(list01);

		System.out.println(123);
	}

	public static void Test(final List<? extends test01> list) {
		
	}
	
	
	static class test<t extends test01>{
		
	}
}
