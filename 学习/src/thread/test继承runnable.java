package thread;

public class test¼Ì³Ðrunnable implements Runnable {
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
	public static void main(String[] args) {
		Thread thread1=new Thread(new test¼Ì³Ðrunnable());
		thread1.start();
		Thread thread2=new Thread(new test¼Ì³Ðrunnable());
		thread2.start();
	}
	
}
