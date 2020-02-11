package niuke;

import java.util.ArrayList;
import java.util.List;

import org.omg.Messaging.SyncScopeHelper;
public class question1 {
	public static void main(final String[] args) {

		final List<Integer> list = new ArrayList<Integer>();
		for (int i = 11; i <= 20; i++) {
			list.add(i);
		}
		// ��ȡ����Ϊ5����Ԫ��
		System.out.println(list.get(5));
		// ��ȡ����ĳ2��Ԫ�ص�����
		System.out.println(list.indexOf(15));
		System.out.println(list.indexOf(16));
		// ɾ������Ϊ3����Ԫ��
		list.remove(3);

		final List<Integer> List2 = new ArrayList<Integer>();
		for(int i2=1;i2<=10;i2++)
		{
			List2.add(i2);
		}
		System.out.println(List2.get(2));
	}
        
}
