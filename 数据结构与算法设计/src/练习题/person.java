package 练习题;

import java.util.Scanner;

public class person {
    public static void main(String[] args) {
        System.out.println("试运行");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] c;
        int sum=0;
        c=new int[n];
        init(c);
        for (int i = 0; i < c.length; i++) {
            sum+=c[i];
        }
        System.out.println("总和是"+sum);
        sc.close();
    }

    public static void init(int[] c) {
        c[0]=1;
        c[1]=1;
        for(int n=2;n<c.length;n++){
            c[n]=c[n-2]+c[n-1];
        }

    }
}