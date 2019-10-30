package map;
/**
 * 为了存储数据
 * javabean bo vo po
 * @author DELL
 *
 *
 */

public class test02 {
    private String name;
    private int count;
    
    //空构造器alt+\
    public test02() {
    	
	}
	public test02(String name) {
		super();
		this.name = name;
	}
    
    //带参构造器 alt+shift+s     后摁o
	public test02(String name, int count) {
		super();
		this.name = name;
		this.count = count;
	}
	//setter与getter访问器
    //alt+shift+s  摁  r 摁  tab 摁  a  摁enter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
    
}
