package map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
 */
public class hashmap {

	public static void main(String[] args) throws IOException {
		//1.�ָ��ַ���
		//String[] arr="that is a cat and that is a mice and where are the food ?".split(" ");
		  BufferedReader arr = new BufferedReader(new InputStreamReader(System.in)); 
          String[] str = null; 
          System.out.println("Enter your value:"); 
          str = arr.readLine().split(" ");  
		//2.�ּ�洢
		Map<String,Integer> map=new HashMap<String,Integer>();
		for(String key:str){
			
			//System.out.println(key);     //ÿ������
			//�鿴�Ƿ���ڵ���
			
		//	if(!map.containsKey(key)) {//������
		//		map.put(key, 1);
		//	}else {//����
		//		map.put(key,map.get(key)+1);
		//	}
			
			Integer value=map.get(key);
			if(value==null) {
				map.put(key, 1);
			}else {
			    map.put(key,map.get(key)+1);
			}
			
			
			
		}	
			//�鿴ÿ�����ʳ��ֵĴ���
			Set<String> keyset=map.keySet();
			Iterator<String> it=keyset.iterator();
		    while(it.hasNext()) {
		    String key=it.next();
		    Integer value=map.get(key);
            System.out.println(key+"-->"+value);
		    }
		
		
		
	}
}
