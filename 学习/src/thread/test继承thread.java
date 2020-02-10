package thread;

public class test¼Ì³Ðthread extends Thread {
	
	
	@Override
	public void run() {

		for(int i=0;i<10;i++) {
			//getName·µ»ØµÄÊÇÏß³ÌµÄÃû×Ö
			System.out.println(this.getName()+":"+i);
		}
		
	}
	
	public static void main(String[] args) {
		test¼Ì³Ðthread thread1=new test¼Ì³Ðthread();
		test¼Ì³Ðthread thread2=new test¼Ì³Ðthread();
		thread1.start();
		thread2.start();
	}
	
}
