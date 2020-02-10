package 学习;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class 测试javabean和list的表格导入 {

	public static void main(String[] args) {
		User user1=new User(1001,"xiaohu",2000,"2010_10_10");
		User user2=new User(1002,"zhansan",2000,"2010_10_10");
		User user3=new User(1003,"lisi",2000,"2010_10_10");
		User user4=new User(1004,"wangwu",2000,"2010_10_10");
	
		
		List<User> userlist =new ArrayList<User>();
	userlist.add(user4);
	userlist.add(user2);
	userlist.add(user3);
	userlist.add(user1);
	
	for(User u:userlist) {
		System.out.println(u);
	}
	
	Map<Integer,User> map=new HashMap<>();
	map.put(1001, user1);
	map.put(1002, user2);
	map.put(1003, user3);
	Set<Integer> keyset=map.keySet();
	for(Integer key:keyset) {
		System.out.println(key+"===="+map.get(key));
		
	}
	
	}
	
}




class User{
	private int id;
	private String name;
	private double salary;
	private String hiredate;
	
	//一个完整的javabean要有setget方法，以及一个空的构造器
	
	public User() {
		
	}
	
	public User(int id, String name, double salary, String hiredate) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.hiredate = hiredate;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	
	@Override
	public String toString() {
		return "id"+id+"\t"+name+"\t" +salary+"\t "+hiredate;
		
	}
	
}