package map;

import java.util.*;

/**
 * �ּ�洢���һ�Զ�Ĺ�ϵ 
 * ͳ�Ƶ��ʳ��ֵĴ���
 * that is a cat and that is a mice and where are the food?
 * 
 * 
 * ˼·��	
 *�ָ��ַ���
 *�ּ�洢
 *��Ҫ��鿴���ʳ��ֵĴ���
 *�����������
 *
 */
public class hashmap3 {

	public static void main(String[] args) {
		//1.�ָ��ַ���
		String[] arr="that is a cat and that is a mice and where are the food ?".split(" ");
		//2.�ּ�洢
		Map<String,test02> map=new HashMap<String,test02>();
		for(String key:arr){
			//��һ�β鿴�Ƿ���ڴ���
			/*if(!map.containsKey(key)) {
				map.put(key, new test02());
			}
			test02 value=map.get(key);
			value.setCount(value.getCount()+1);*/
			
			test02 value=map.get(key); 
			
			if(null==value) {
				value=new test02();
				map.put(key, value);
			}
			value.setCount(value.getCount()+1);
	
			
		}	
			//�鿴ÿ�����ʳ��ֵĴ���
		for(String key:map.keySet()) {
			test02 value=map.get(key);
			System.out.println(key+"-->"+value.getCount());

			
		}
		
	}
}
