package 飞机游戏1版;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;

public class 飞机 extends 游戏项目{
	boolean live=true;
	public void huaziji(Graphics g) {
		if(live) {
		super.huaziji(g);
        if (left) {
            x -= speed;
          //  System.out.println("向左一下");
        }
        if (right) {
            x += speed;
          //  System.out.println("向右一下");
        }
        if (up) {
            y -= speed;
          //  System.out.println("向上一下");
        }
        if (down) {
            y += speed;
          //  System.out.println("向下一下");
        }
	}}
	
    boolean left, up, right, down;
 
    // 按下上下左右键，则改变方向值。
    // 比如：按下上键，则e.getKeyCode()的值就是VK_UP，那么置：up=true;
    public void addDirection(KeyEvent e) {
        switch (e.getKeyCode()) {
        case KeyEvent.VK_LEFT:
            left = true;
        	System.out.println("向左一下");
            break;
        case KeyEvent.VK_UP:
            up = true;
            System.out.println("向上一下");
            break;
        case KeyEvent.VK_RIGHT:
            right = true;
            System.out.println("向右一下");
            break;
        case KeyEvent.VK_DOWN:
            down = true;
            System.out.println("向下一下");
            break;
        default:
            break;
        }
    }
 
    // 松开上下左右键，则改变方向值。
    // 比如：松开上键，则e.getKeyCode()的值就是VK_UP，那么置：up=false;
    public void minusDirection(KeyEvent e) {
        switch (e.getKeyCode()) {
        case KeyEvent.VK_LEFT:
            left = false;
            break;
        case KeyEvent.VK_UP:
            up = false;
            break;
        case KeyEvent.VK_RIGHT:
            right = false;
            break;
        case KeyEvent.VK_DOWN:
            down = false;
            break;
        default:
            break;
        }
    }

	
	
	
	
	
	public 飞机(Image img, int x, int y,int speed) {
	    super(img,x,y);
	    this.speed=speed;
	    this.width=10;
	    this.height=10;
  //     this.x=x;
    //   this.y=y;
      // this.img=img;
}
}