package thread;

public class 线程优先级设置 {
	public static void main(String[] args) {
		Thread t1=new Thread(new MyThread2(),"t1");
		Thread t2=new Thread(new MyThread2(),"t2");
		t1.setPriority(1);
		t2.setPriority(10);
		t1.start();
		t2.start();
		
	}
}
class MyThread2 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}