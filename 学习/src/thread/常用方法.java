package thread;

 /**
 * @author TSY
 *这里是copy的
 */
public class 常用方法 {
    public static void main(String[] argc) throws Exception {
        Runnable r = new MyThread2();
        Thread t = new Thread(r, "Name test");//定义线程对象，并传入参数；
        t.start();//启动线程；
        System.out.println("name is: " + t.getName());//输出线程名称；
        Thread.currentThread().sleep(5000);//线程暂停5s；
        System.out.println(t.isAlive());//判断线程还在运行吗？
        System.out.println("over!");
    }
}


class MyThread implements Runnable {
    //线程体；
    public void run() {
        for (int i = 0; i < 10; i++)
            System.out.println(i);
    }
 }