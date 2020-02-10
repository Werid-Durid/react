package 学习计划1章;

public class 测试常量 {
	 public static void main(String[] args) {
	        final double PI = 3.14;
	        // PI = 3.15; //编译错误，不能再被赋值！ 
	        double r = 4;
	        double area = PI * r * r;
	        double circle = 2 * PI * r;
	        System.out.println("area = " + area);
	        System.out.println("circle = " + circle);
	    }
}
