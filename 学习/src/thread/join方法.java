package thread;
		
/**
 * @author tsy
 *join������ʹ��������߳��жϣ���ִ�м�����߳̽������ټ���ִ�С�
 */
public class join���� {
	public static void main(String[] args) {
		System.out.println("��ʼ����");
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