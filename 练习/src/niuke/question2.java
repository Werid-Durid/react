package niuke;

public class question2 {
	public static void main(String[] args) {
		for(int i = 1;i<256;i++) {
			int j=i*i;
			int i2=0;
		    while(j>0) {
		    	i2=i2*10+j%10;
		    	j=j/10;
		    }
		    if(i2==i*i) {
		    	System.out.println(i);
		    }
		}
	}

}
