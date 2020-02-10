package 飞机游戏1版;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class 游戏项目 {
	Image img;
	int x,y;
	int speed;
	int width,height;
	public void huaziji(Graphics g) {
		g.drawImage(img, x, y, null);
	}
	
	public 游戏项目(Image img, int x, int y, int speed, int width, int height) {
		super();
		this.img = img;
		this.x = x;
		this.y = y;
		this.speed = speed;
		this.width = width;
		this.height = height;
	}
	
	
	public 游戏项目(Image img, int x, int y) {
		super();
		this.img = img;
		this.x = x;
		this.y = y;
	}
	public 游戏项目() {
		
	}
	public Rectangle getRect(){
	      return  new Rectangle((int)x,(int) y, width, height);
	    		 // gle((int)x,(int) y, width, height);
	}  
}
