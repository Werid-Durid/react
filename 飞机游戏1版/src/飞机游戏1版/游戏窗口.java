package �ɻ���Ϸ1��;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
 * �ɻ���Ϸ��������
 * @author tsy
 *
 */
public class ��Ϸ���� extends Frame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1501969731312413634L;

	int x=250,y=250;

		Image ���˻�=GameUtil.getImage("images/bk1.jpg");
		Image ��ʱ�ɻ�=GameUtil.getImage("images/��ʱ�ɻ�.png");
		�ɻ� p2= new �ɻ�(���˻�,100,100,5); 
		�ɻ� p= new �ɻ�(��ʱ�ɻ�,400,400,5);//С��Ƭ���Ҳ�����
		�ڵ�[] shells= new �ڵ�[20];
	@Override
	public void paint(Graphics g) {				//ϵͳ�Զ����ã�ֻ����repaint��д�÷���
		Color c=g.getColor();
	/**	g.setColor(Color.blue);
		
		g.drawLine(100,100,300,300);//    rect ����   string �ַ���    ��fill ��� 
		g.drawOval(100,100,300,300);
		g.setColor(c);//������ɫ����
		g.drawOval(100,100,400,400);
		
		*/
		g.drawImage(���˻�, 0, 0, null);
		//g.drawImage(���˻�, x, y, null);
		p.huaziji(g);
	//  x+=3;
	//	y+=3;
		g.setColor(c);
		
		//���ڵ�
		for (int i = 0; i < shells.length; i++) {
			shells[i].draw(g);
			if(p.live) {
			if(shells[i].getRect().intersects(p.getRect())) {
				System.out.println("��ײ�ˣ���");
				p.live=false;
			}}
		if(shells[i].speed==0) {
				continue;
			}
			shells[i].speed-=0;
			
		}
		
	}
	
	//����Ϊ�ڲ��࣬���Է����ʹ���ⲿ�����ͨ����
    class KeyMonitor extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            p.addDirection(e);
        }
 
        @Override
        public void keyReleased(KeyEvent e) {
            p.minusDirection(e);
        }
    }
	
    private Image offScreenImage = null;
    
    public void update(Graphics g) {
        if(offScreenImage == null)
            offScreenImage = this.createImage(Constant.gamewidth,Constant.gameheight);//������Ϸ���ڵĿ�Ⱥ͸߶�
         
        Graphics gOff = offScreenImage.getGraphics();
        paint(gOff);
        g.drawImage(offScreenImage, 0, 0, null);
    }  
	
	
	//�߳�
	class PaintThread extends Thread {
		@Override
		public void run() {
			while(true) {
				repaint();//�ػ�
				//System.out.println("���ڱ���");
				
				try {
					Thread.sleep(20);
				} catch (InterruptedException e) { 	
					e.printStackTrace();
				}//һ��50��
			}
		}
	}
	
	
	
	
	
	
	public  void launchFrame() {
		
		this.setTitle("̷ڡԪ��Ʒ");
		this.setVisible(true);
		this.setSize(1500,1500); 
		this.setLocation(0,0);
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		//��ʼ���ڵ�
		for (int i = 0; i < shells.length; i++) {
			shells[i]=new �ڵ�();
			
		}
		
		//�����ػ����ڵ��߳�
		new PaintThread().start();
		
		addKeyListener(new KeyMonitor());//���Ӽ��̵ļ���
	} 
	
	
public static void main(String[] args) {
		��Ϸ���� f=new ��Ϸ����();
		f.launchFrame();
	}

}