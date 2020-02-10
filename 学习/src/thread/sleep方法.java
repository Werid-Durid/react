package thread;

public class sleep方法 {
	public static void main(String[] args) {
//		sleep方法 s1=new sleep方法();
		StateThread st1=new StateThread();
		st1.start();
		StateThread st2=new StateThread();
		st2.start();
	}
}
	//使用继承方式实现多线程
	class StateThread extends Thread {
	    public void run() {
	        for (int i = 0; i < 100; i++) {
	            System.out.println(this.getName() + ":" + i);
	            try {
	                Thread.sleep(2000);//调用线程的sleep()方法；
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}

