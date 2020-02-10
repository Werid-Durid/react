package thread;

/**
 * @author tsy
 *守护线程：是为了用户线程服务的；jvm停止不用等待守护线程执行完毕
 *默认都是用户线程，jvm等待所有的用户线程执行完毕才会停止
 *
 */
public class 守护线程测试 {
	public static void main(String[] args) {
		god god=new god();
		you you=new you();
		Thread t=new Thread(god);
		t.setDaemon(true);//将用户线程调整为守护，不用等待守护线程执行完毕
		t.start();
		new Thread(god).start();
		new Thread(you).start();
	}
}
class you implements Runnable{
	public void run() {

		for(int i=1;i<=365*100;i++) {
			System.out.println("life is gone");
		}
		System.out.println("0000000000");
	}
}

class god implements Runnable{
	public void run() {
		while(true) {
					System.out.println("bless");
		}
	}
}
