package 练习题;

public class jinzhi {
	
	public static int x2=0;
static int jinzhi2(int x) {
	if(x/2>0) {
		if(x%2==1) {
		x2++;
		System.out.println(x+"\t"+1);
		jinzhi2(x/2);
		}
		if(x%2==0) {
			System.out.println(x+"\t"+0);
			jinzhi2(x/2);
		}
	}
	//
if(x==1) {
	System.out.println(1+"\t"+1);
	x2++;}
	return x2;	
	

	
}
public static void main(String[] args) {
	System.out.println("�����Ķ���������"+jinzhi2(48)+"��1");
}
}


