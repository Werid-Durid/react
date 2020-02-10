package 飞机游戏1版;

import java.awt.Color;
import java.awt.Graphics;

public class 炮弹 extends 游戏项目{
	double degree;
    public 炮弹(){
        degree = Math.random()*Math.PI*2;
        x = 200;
        y = 200;
        width = 10;
        height = 10;
        speed =10;
    }
    public void draw(Graphics g){
        //将外部传入对象g的状态保存好
        Color c = g.getColor();
        g.setColor(Color.yellow);
 
        g.fillOval((int)x, (int)y, width, height);
        //如下代码，用来实现碰到边界，炮弹反弹回来(原理和打台球游戏一样)
        if(y>Constant.gameheight-height-30||y<100){
            degree = -degree;
            if(y>Constant.gameheight-height-30) {
            y=Constant.gameheight-height-30;
            }
            if(y<100)
            	y=100;
        }
        if(x<30||x>Constant.gamewidth-width-30){
            degree = Math.PI-degree;
            if(x>Constant.gamewidth-width-30)
            	x=Constant.gamewidth-width-30;
            if(x<30)
            	x=30;
        }
         
        //炮弹沿着任意角度飞行
        x += speed*Math.cos(degree);
        y += speed*Math.sin(degree);
         
       
        //返回给外部，变回以前的颜色
        g.setColor(c);
    }
}
