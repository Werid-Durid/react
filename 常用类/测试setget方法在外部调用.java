package ������;

public class ����setget�������ⲿ���� {
public static void main(String[] args) {
		����setget�������ⲿ���� x=new ����setget�������ⲿ����();
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
		// TODO �Զ����ɵķ������
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
