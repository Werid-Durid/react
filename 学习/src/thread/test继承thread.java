package thread;

public class test�̳�thread extends Thread {
	
	
	@Override
	public void run() {

		for(int i=0;i<10;i++) {
			//getName���ص����̵߳�����
			System.out.println(this.getName()+":"+i);
		}
		
	}
	
	public static void main(String[] args) {
		test�̳�thread thread1=new test�̳�thread();
		test�̳�thread thread2=new test�̳�thread();
		thread1.start();
		thread2.start();
	}
	
}
