package 学习计划第二章;

public class 测试各种循环 {
	    public static void main(String[] args) {
	    	
	    	//多重if else
	        int age = (int) (100 * Math.random());
	        System.out.print("年龄是" + age + "， 属于");
	        if (age < 15) {
	            System.out.println("儿童， 喜欢玩！");
	        } else if (age < 25) {
	            System.out.println("青年， 要学习！");
	        } else if (age < 45) {
	            System.out.println("中年， 要工作！");
	        } else if (age < 65) {
	            System.out.println("中老年， 要补钙！");
	        } else if (age < 85) {
	            System.out.println("老年， 多运动！");
	        } else {
	            System.out.println("老寿星， 古来稀！");
	        }
	        
	        //switch
	        char c = 'a';
	        int rand = (int) (26 * Math.random());
	        char c2 = (char) (c + rand);
	        System.out.print(c2 + ": ");
	        switch (c2) {
	        case 'a':
	        case 'e':
	        case 'i':
	        case 'o':
	        case 'u':
	            System.out.println("元音");
	            break;
	        case 'y':
	        case 'w':
	            System.out.println("半元音");
	            break;
	        default:
	            System.out.println("辅音");
	        }
	        
	        //while
	        int  i = 0;
	        int  sum = 0;
	        // 1+2+3+…+100=?
	        while (i <= 100) {
	            sum += i;//相当于sum = sum+i;
	            i++;
	        }
	        System.out.println("Sum= " + sum);
	        
	        //dowhile
	        int i1 = 0;
	        int sum1 = 0;
	        do {
	            sum1 += i1; // sum = sum + i
	            i1++;
	        } while (i1 <= 100);//此处的；不能省略
	        System.out.println("Sum= " + sum1);
	        
	        //for
	        int sum2 = 0;
	        //1.求1-100之间的累加和
	        for (int i2 = 0; i2 <= 100; i2++) {
	            sum2 += i2;
	        }
	        System.out.println("Sum= " + sum2);
	        //2.循环输出9-1之间的数
	        for(int i2=9;i2>0;i2--){
	            System.out.print(i2+"、");
	        }
	        System.out.println();
	        //3.输出90-1之间能被3整除的数
	        for(int i2=90;i2>0;i2-=3){
	            System.out.print(i2+"、");
	        }
	        System.out.println();
	        
	        //逗号运算符
	        for(int i3 = 1, j = i3 + 10; i3 < 5; i3++, j = i3 * 2) {
	            System.out.println("i= " + i3 + " j= " + j); 
	        }
	        
	        
	        //嵌套循环
	        for (int i4 = 1; i4 < 10; i4++) { // i是一个乘数
	            for (int j = 1; j <= i4; j++) { // j是另一个乘数
	                System.out.print(j + "*" + i4 + "=" + (i4 * j < 10 ? (" " + i4 * j) : i4 * j) + "  ");
	            }
	            System.out.println();
	        }
}
}