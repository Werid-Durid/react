package map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
 */
public class hashmap {

	public static void main(String[] args) throws IOException {
		//1.分割字符串
		//String[] arr="that is a cat and that is a mice and where are the food ?".split(" ");
		  BufferedReader arr = new BufferedReader(new InputStreamReader(System.in)); 
          String[] str = null; 
          System.out.println("Enter your value:"); 
          str = arr.readLine().split(" ");  
		//2.分拣存储
		Map<String,Integer> map=new HashMap<String,Integer>();
		for(String key:str){
			
			//System.out.println(key);     //每个单词
			//查看是否存在单词
			
		//	if(!map.containsKey(key)) {//不存在
		//		map.put(key, 1);
		//	}else {//存在
		//		map.put(key,map.get(key)+1);
		//	}
			
			Integer value=map.get(key);
			if(value==null) {
				map.put(key, 1);
			}else {
			    map.put(key,map.get(key)+1);
			}
			
			
			
		}	
			//查看每个单词出现的次数
			Set<String> keyset=map.keySet();
			Iterator<String> it=keyset.iterator();
		    while(it.hasNext()) {
		    String key=it.next();
		    Integer value=map.get(key);
            System.out.println(key+"-->"+value);
		    }
		
		
		
	}
}
