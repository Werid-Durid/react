package cn.testoop;

import java.util.ArrayList;
import java.util.List;

/**
 * 自己实现一个ArrayList，帮助我们更好地理解底层结构
 * @author DELL
 *
 */
public class rongqitwo {
	private static Object[] 	elementData;	
	private int size;	
	public rongqitwo() {
		this(10);
	}

	public rongqitwo(int exption) {
		if(exption<0) {
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		elementData= new  Object[exption];
	}
	
	public void add(Object obj) {
		//数组扩容
		if(size==elementData.length) {
			Object[] newarray=new Object[size+1];
			System.arraycopy(elementData, 0, newarray, 0, elementData.length);
			elementData=newarray;
		}
		elementData[size++]=obj;
	}
	
	public int size() {
		return size;
	}
	public  Object get(int index) {
		if(index>=size||index<0) {
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return elementData[index];
	}
	
	
	
	
	
	
	public static void main(String[] args) {
	List m=new ArrayList();
	rongqitwo fi=new rongqitwo();
	rongqitwo b=new rongqitwo(2);
	fi.add("aaa");
	System.out.println(fi.size());
	System.out.println(fi.get(0));
	}
}

