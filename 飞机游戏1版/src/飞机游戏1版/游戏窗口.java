package 飞机游戏1版;

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
 * 飞机游戏的主窗口
 * @author tsy
 *
 */
public class 游戏窗口 extends Frame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1501969731312413634L;

	int x=250,y=250;

		Image 亚运会=GameUtil.getImage("images/bk1.jpg");
		Image 临时飞机=GameUtil.getImage("images/临时飞机.png");
		飞机 p2= new 飞机(亚运会,100,100,5); 
		飞机 p= new 飞机(临时飞机,400,400,5);//小照片难找不找了
		炮弹[] shells= new 炮弹[20];
	@Override
	public void paint(Graphics g) {				//系统自动调用，只能用repaint重写该方法
		Color c=g.getColor();
	/**	g.setColor(Color.blue);
		
		g.drawLine(100,100,300,300);//    rect 矩形   string 字符串    加fill 填充 
		g.drawOval(100,100,300,300);
		g.setColor(c);//画笔颜色返还
		g.drawOval(100,100,400,400);
		
		*/
		g.drawImage(亚运会, 0, 0, null);
		//g.drawImage(亚运会, x, y, null);
		p.huaziji(g);
	//  x+=3;
	//	y+=3;
		g.setColor(c);
		
		//画炮弹
		for (int i = 0; i < shells.length; i++) {
			shells[i].draw(g);
			if(p.live) {
			if(shells[i].getRect().intersects(p.getRect())) {
				System.out.println("相撞了！！");
				p.live=false;
			}}
		if(shells[i].speed==0) {
				continue;
			}
			shells[i].speed-=0;
			
		}
		
	}
	
	//定义为内部类，可以方便的使用外部类的普通属性
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
            offScreenImage = this.createImage(Constant.gamewidth,Constant.gameheight);//这是游戏窗口的宽度和高度
         
        Graphics gOff = offScreenImage.getGraphics();
        paint(gOff);
        g.drawImage(offScreenImage, 0, 0, null);
    }  
	
	
	//线程
	class PaintThread extends Thread {
		@Override
		public void run() {
			while(true) {
				repaint();//重画
				//System.out.println("窗口被画");
				
				try {
					Thread.sleep(20);
				} catch (InterruptedException e) { 	
					e.printStackTrace();
				}//一秒50次
			}
		}
	}
	
	
	
	
	
	
	public  void launchFrame() {
		
		this.setTitle("谭凇元作品");
		this.setVisible(true);
		this.setSize(1500,1500); 
		this.setLocation(0,0);
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		//初始化炮弹
		for (int i = 0; i < shells.length; i++) {
			shells[i]=new 炮弹();
			
		}
		
		//启动重画窗口的线程
		new PaintThread().start();
		
		addKeyListener(new KeyMonitor());//增加键盘的监听
	} 
	
	
public static void main(String[] args) {
		游戏窗口 f=new 游戏窗口();
		f.launchFrame();
	}

}