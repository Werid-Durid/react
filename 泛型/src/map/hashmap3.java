package map;

import java.util.*;

/**
 * 分拣存储解决一对多的关系 
 * 统计单词出现的次数
 * that is a cat and that is a mice and where are the food?
 * 
 * 
 * 思路：	
 *分割字符串
 *分拣存储
 *按要求查看单词出现的次数
 *加入面向对象
 *
 */
public class hashmap3 {

	public static void main(String[] args) {
		//1.分割字符串
		String[] arr="that is a cat and that is a mice and where are the food ?".split(" ");
		//2.分拣存储
		Map<String,test02> map=new HashMap<String,test02>();
		for(String key:arr){
			//第一次查看是否存在袋子
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
			//查看每个单词出现的次数
		for(String key:map.keySet()) {
			test02 value=map.get(key);
			System.out.println(key+"-->"+value.getCount());

			
		}
		
	}
}
