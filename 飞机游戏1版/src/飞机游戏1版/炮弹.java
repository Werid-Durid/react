package �ɻ���Ϸ1��;

import java.awt.Color;
import java.awt.Graphics;

public class �ڵ� extends ��Ϸ��Ŀ{
	double degree;
    public �ڵ�(){
        degree = Math.random()*Math.PI*2;
        x = 200;
        y = 200;
        width = 10;
        height = 10;
        speed =10;
    }
    public void draw(Graphics g){
        //���ⲿ�������g��״̬�����
        Color c = g.getColor();
        g.setColor(Color.yellow);
 
        g.fillOval((int)x, (int)y, width, height);
        //���´��룬����ʵ�������߽磬�ڵ���������(ԭ��ʹ�̨����Ϸһ��)
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
         
        //�ڵ���������Ƕȷ���
        x += speed*Math.cos(degree);
        y += speed*Math.sin(degree);
         
       
        //���ظ��ⲿ�������ǰ����ɫ
        g.setColor(c);
    }
}
