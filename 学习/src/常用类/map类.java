package ������;

import java.util.HashMap;
import java.util.Map;

public class map�� {
	public static void main(String[] args) {
		Map<Integer,String> map1=new HashMap<>();
		//��ϣ���������������ŵ㣬��ѯ�͸��¶���
//		jdk1.6
		
		
		map1.put(1,"one");
		map1.put(2,"two");
		map1.put(3,"three");
		
		
		map1.get(1);
		day monday=new day(12,12);
		System.out.println(monday.hashCode());
		System.out.println(monday.toString());
		System.out.println(map1.get(1));
		
		System.out.println(map1.containsKey(2));

		
		
	}
		
	static class day{
		int minute,hours;

		public day(int minute, int hours) {
			super();
			this.minute = minute;
			this.hours = hours;
		}

		public day() {
		}

		public int getMinute() {
			return minute;
		}

		public void setMinute(int minute) {
			this.minute = minute;
		}

		public int getHours() {
			return hours;
		}

		public void setHours(int hours) {
			this.hours = hours;
		}
		
	}
	

}
