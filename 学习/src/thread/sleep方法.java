package thread;

public class sleep���� {
	public static void main(String[] args) {
//		sleep���� s1=new sleep����();
		StateThread st1=new StateThread();
		st1.start();
		StateThread st2=new StateThread();
		st2.start();
	}
}
	//ʹ�ü̳з�ʽʵ�ֶ��߳�
	class StateThread extends Thread {
	    public void run() {
	        for (int i = 0; i < 100; i++) {
	            System.out.println(this.getName() + ":" + i);
	            try {
	                Thread.sleep(2000);//�����̵߳�sleep()������
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}

