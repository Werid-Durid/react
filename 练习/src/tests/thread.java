package tests;

public class thread {
public static void main(String[] args) {
	Runnable printA =new printchar('a',100);
	Runnable printB =new printchar('b',100);
	Runnable print100 =new printnum(100);
	
	
	Thread thread1 = new Thread(printA);
	Thread thread2 = new Thread(printB);
	Thread thread3 = new Thread(print100);
    
	thread1.start();
	thread2.start();
	thread3.start();
}
}


class printchar implements Runnable{
	private char chartoprint;
	private int time;
	
	
	public printchar(char chartoprint, int time) {
		super();
		this.chartoprint = chartoprint;
		this.time = time;
	}
	


	public void run(){
	for(int i=0;i<time;i++) {
		System.out.print(chartoprint);
	}
	}
	
}



class printnum implements Runnable{
	private int lastnum;
	
	public printnum(int lastnum) {
		super();
		this.lastnum = lastnum;
	}

	public void run() {
		for(int i=0;i<lastnum;i++) {
			System.out.print(" "+i);
		}
	}
}


