package thread;

public class test�̳�runnable implements Runnable {
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
	public static void main(String[] args) {
		Thread thread1=new Thread(new test�̳�runnable());
		thread1.start();
		Thread thread2=new Thread(new test�̳�runnable());
		thread2.start();
	}
	
}
