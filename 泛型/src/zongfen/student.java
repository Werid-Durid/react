package zongfen;

public class student {
private String name;
private  double score;
private String no;

public student() {
}


public student(String name, double score, String no) {
	super();
	this.name = name;
	this.score = score;
	this.no = no;
}


public String getName() {
	return name;
}
public double getScore() {
	return score;
}
public String getNo() {
	return no;
}
public void setName(String name) {
	this.name = name;
}
public void setScore(int score) {
	this.score = score;
}
public void setSo(String no) {
	this.no = no;
}


}
