package 常用类;

public class 测试setget方法在外部调用 {
public static void main(String[] args) {
		测试setget方法在外部调用 x=new 测试setget方法在外部调用();
employee e=x.new employee("sada",1);
System.out.println(e.getName());

	e.setName("xs");
	System.out.println(e.getName());
	System.out.println(e.toString());
}



class employee{
String name;
int sex;
@Override
	public String toString() {
		// TODO 自动生成的方法存根
		return "id="+super.toString();
	}

public employee(String name, int sex) {
super();
this.name = name;
this.sex = sex;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public int getSex() {
return sex;
}
public void setSex(int sex) {
this.sex = sex;
}

}	
}
