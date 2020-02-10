package thread;
		
/**
 * @author tsy
 *join方法会使被加入的线程中断，先执行加入的线程结束后再继续执行。
 */
public class join方法 {
	public static void main(String[] args) {
		System.out.println("开始计数");
		Thread thread1=new Thread(new one());
		thread1.start();
	}
}

class one  implements Runnable{

	@Override
	public void run() {
		System.out.println("1");
		System.out.println("2");
		Thread second1=new Thread(new second());
		second1.start();
		System.out.println("3");
		try {
		second1.join();	
		} catch (Exception e) {
		e.printStackTrace();
		System.exit(1);
		}
		System.out.println("6");
	}
	
}

class second implements Runnable{

	@Override
	public void run() {
		System.out.println("4");
		System.out.println("5");
		
	}
	
}