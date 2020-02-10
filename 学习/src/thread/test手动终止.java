package thread;

public class test手动终止  implements Runnable{
	String name;
	boolean live=true;

	public test手动终止(String name) {
		super();
		this.name = name;
	}

	public void run() {
		int i=0;
		while(live) {
			System.out.println(name+(i++));
		}
	}
	
	public void letfalse() {
		live=false;
	}
	
	
	public static void main(String[] args) {
		test手动终止 ttc=new test手动终止("线程a:");
		Thread t1=new Thread(ttc);
		t1.start();
		for(int i=0;i<10;i++) {
			System.out.println("主线程"+i);
			
		}
		ttc.letfalse();
		System.out.println("ttc stop!");
	}
	
}
