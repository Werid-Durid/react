package niuke;

import java.util.ArrayList;
import java.util.List;

import org.omg.Messaging.SyncScopeHelper;
public class question1 {
	public static void main(String[] args) {
		

		List<Integer> list = new ArrayList<Integer>();
		for(int i = 11; i <=20; i++){
		    list.add(i);
		}
		//获取索引为5处的元素
		System.out.println(list.get(5));
		//获取其中某2个元素的索引
		System.out.println(list.indexOf(15));
		System.out.println(list.indexOf(16));
		//删除索引为3处的元素
		list.remove(3);
		
		
		
		List<Integer> List2 = new ArrayList<Integer>();
		for(int i2=1;i2<=10;i2++)
		{
			List2.add(i2);
		}
		System.out.println(List2.get(2));
	}
        
}
