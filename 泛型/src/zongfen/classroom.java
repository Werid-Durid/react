package zongfen;

import java.util.ArrayList;
import java.util.List;

public class classroom {
	private String no;//�༶���
	private List<student> stulist;//�༶�б�
	private double total;//�ܷ�
	public classroom() {
		stulist=new ArrayList<student>();
	}
	public classroom(String no) {
		this();
		this.no=no;
	}
	
	
	public classroom(String no, List<student> stulist, double total) {
		super();
		this.no = no;
		this.stulist = stulist;
		this.total = total;
	}

	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public List<student> getStulist() {
		return stulist;
	}
	public void setStulist(List<student> stulist) {
		this.stulist = stulist;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	

}
