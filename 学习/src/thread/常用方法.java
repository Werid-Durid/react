package thread;

 /**
 * @author TSY
 *������copy��
 */
public class ���÷��� {
    public static void main(String[] argc) throws Exception {
        Runnable r = new MyThread2();
        Thread t = new Thread(r, "Name test");//�����̶߳��󣬲����������
        t.start();//�����̣߳�
        System.out.println("name is: " + t.getName());//����߳����ƣ�
        Thread.currentThread().sleep(5000);//�߳���ͣ5s��
        System.out.println(t.isAlive());//�ж��̻߳���������
        System.out.println("over!");
    }
}


class MyThread implements Runnable {
    //�߳��壻
    public void run() {
        for (int i = 0; i < 10; i++)
            System.out.println(i);
    }
 }