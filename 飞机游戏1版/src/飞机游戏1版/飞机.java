package �ɻ���Ϸ1��;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;

public class �ɻ� extends ��Ϸ��Ŀ{
	boolean live=true;
	public void huaziji(Graphics g) {
		if(live) {
		super.huaziji(g);
        if (left) {
            x -= speed;
          //  System.out.println("����һ��");
        }
        if (right) {
            x += speed;
          //  System.out.println("����һ��");
        }
        if (up) {
            y -= speed;
          //  System.out.println("����һ��");
        }
        if (down) {
            y += speed;
          //  System.out.println("����һ��");
        }
	}}
	
    boolean left, up, right, down;
 
    // �����������Ҽ�����ı䷽��ֵ��
    // ���磺�����ϼ�����e.getKeyCode()��ֵ����VK_UP����ô�ã�up=true;
    public void addDirection(KeyEvent e) {
        switch (e.getKeyCode()) {
        case KeyEvent.VK_LEFT:
            left = true;
        	System.out.println("����һ��");
            break;
        case KeyEvent.VK_UP:
            up = true;
            System.out.println("����һ��");
            break;
        case KeyEvent.VK_RIGHT:
            right = true;
            System.out.println("����һ��");
            break;
        case KeyEvent.VK_DOWN:
            down = true;
            System.out.println("����һ��");
            break;
        default:
            break;
        }
    }
 
    // �ɿ��������Ҽ�����ı䷽��ֵ��
    // ���磺�ɿ��ϼ�����e.getKeyCode()��ֵ����VK_UP����ô�ã�up=false;
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

	
	
	
	
	
	public �ɻ�(Image img, int x, int y,int speed) {
	    super(img,x,y);
	    this.speed=speed;
	    this.width=10;
	    this.height=10;
  //     this.x=x;
    //   this.y=y;
      // this.img=img;
}
}