package thread;

/**
 * @author tsy
 *�ػ��̣߳���Ϊ���û��̷߳���ģ�jvmֹͣ���õȴ��ػ��߳�ִ�����
 *Ĭ�϶����û��̣߳�jvm�ȴ����е��û��߳�ִ����ϲŻ�ֹͣ
 *
 */
public class �ػ��̲߳��� {
	public static void main(String[] args) {
		god god=new god();
		you you=new you();
		Thread t=new Thread(god);
		t.setDaemon(true);//���û��̵߳���Ϊ�ػ������õȴ��ػ��߳�ִ�����
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
