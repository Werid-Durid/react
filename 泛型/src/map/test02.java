package map;
/**
 * Ϊ�˴洢����
 * javabean bo vo po
 * @author DELL
 *
 *
 */

public class test02 {
    private String name;
    private int count;
    
    //�չ�����alt+\
    public test02() {
    	
	}
	public test02(String name) {
		super();
		this.name = name;
	}
    
    //���ι����� alt+shift+s     ����o
	public test02(String name, int count) {
		super();
		this.name = name;
		this.count = count;
	}
	//setter��getter������
    //alt+shift+s  ��  r ��  tab ��  a  ��enter

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
