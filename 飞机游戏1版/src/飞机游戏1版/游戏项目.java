package �ɻ���Ϸ1��;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class ��Ϸ��Ŀ {
	Image img;
	int x,y;
	int speed;
	int width,height;
	public void huaziji(Graphics g) {
		g.drawImage(img, x, y, null);
	}
	
	public ��Ϸ��Ŀ(Image img, int x, int y, int speed, int width, int height) {
		super();
		this.img = img;
		this.x = x;
		this.y = y;
		this.speed = speed;
		this.width = width;
		this.height = height;
	}
	
	
	public ��Ϸ��Ŀ(Image img, int x, int y) {
		super();
		this.img = img;
		this.x = x;
		this.y = y;
	}
	public ��Ϸ��Ŀ() {
		
	}
	public Rectangle getRect(){
	      return  new Rectangle((int)x,(int) y, width, height);
	    		 // gle((int)x,(int) y, width, height);
	}  
}
