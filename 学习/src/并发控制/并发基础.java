package 并发控制;

public class 并发基础 {
	public static void main(String[] args) {
		kuan kuangzi=new kuan();
		shenchan sc=new shenchan(kuangzi);
		xiaofei xf=new xiaofei(kuangzi);
		sc.start();
		xf.start();
	}
}

class mantou{
	int id;

	public mantou(int id) {
		this.id = id;
	}
	
}
class kuan{
	int index=0;
	mantou[] mt=new mantou[10];
	public synchronized void push(mantou n) {
		while(index==mt.length) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
			this.notify();
			mt[index]=n;
			index++;
		
	}
	public synchronized mantou pop(){
		while (index==0) {
			try {
				this.wait();
				
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.notify();
		index--;
		return mt[index];
	}
	
	
}


	class shenchan extends Thread{
		kuan x=null;

		public shenchan(kuan x) {
			this.x = x;
		}
		
		public void run() {
			for(int i=0;i<10;i++) {
				System.out.println("生产了"+i);
				mantou m=new mantou(i);
				x.push(m);
			}
		}
	}

	class xiaofei extends Thread{
		kuan x=null;

		public xiaofei(kuan x) {
			this.x = x;
		}
		public void run() {
			for(int i=0;i<10;i++) {
				mantou m=x.pop();
				System.out.println("消费馒头"+i);
			}
		}
	}



