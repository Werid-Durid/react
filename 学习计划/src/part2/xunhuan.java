package part2;

public class xunhuan {
	    public static void main(String[] args) {
	    	
	    	//����if else
	        int age = (int) (100 * Math.random());
	        System.out.print("������" + age + "�� ����");
	        if (age < 15) {
	            System.out.println("��ͯ�� ϲ���棡");
	        } else if (age < 25) {
	            System.out.println("���꣬ Ҫѧϰ��");
	        } else if (age < 45) {
	            System.out.println("���꣬ Ҫ������");
	        } else if (age < 65) {
	            System.out.println("�����꣬ Ҫ���ƣ�");
	        } else if (age < 85) {
	            System.out.println("���꣬ ���˶���");
	        } else {
	            System.out.println("�����ǣ� ����ϡ��");
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
	            System.out.println("Ԫ��");
	            break;
	        case 'y':
	        case 'w':
	            System.out.println("��Ԫ��");
	            break;
	        default:
	            System.out.println("����");
	        }
	        
	        //while
	        int  i = 0;
	        int  sum = 0;
	        // 1+2+3+��+100=?
	        while (i <= 100) {
	            sum += i;//�൱��sum = sum+i;
	            i++;
	        }
	        System.out.println("Sum= " + sum);
	        
	        //dowhile
	        int i1 = 0;
	        int sum1 = 0;
	        do {
	            sum1 += i1; // sum = sum + i
	            i1++;
	        } while (i1 <= 100);//�˴��ģ�����ʡ��
	        System.out.println("Sum= " + sum1);
	        
	        //for
	        int sum2 = 0;
	        //1.��1-100֮����ۼӺ�?
	        for (int i2 = 0; i2 <= 100; i2++) {
	            sum2 += i2;
	        }
	        System.out.println("Sum= " + sum2);
	        //2.ѭ�����?9-1֮�����?
	        for(int i2=9;i2>0;i2--){
	            System.out.print(i2+"��");
	        }
	        System.out.println();
	        //3.���?90-1֮���ܱ�3��������
	        for(int i2=90;i2>0;i2-=3){
	            System.out.print(i2+"��");
	        }
	        System.out.println();
	        
	        //���������?
	        for(int i3 = 1, j = i3 + 10; i3 < 5; i3++, j = i3 * 2) {
	            System.out.println("i= " + i3 + " j= " + j); 
	        }
	        
	        
	        //Ƕ��ѭ��
	        for (int i4 = 1; i4 < 10; i4++) { // i��һ������
	            for (int j = 1; j <= i4; j++) { // j����һ������
	                System.out.print(j + "*" + i4 + "=" + (i4 * j < 10 ? (" " + i4 * j) : i4 * j) + "  ");
	            }
	            System.out.println();
	        }
}
}