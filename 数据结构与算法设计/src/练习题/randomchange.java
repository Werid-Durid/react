package 练习题;
public class randomchange{
    public static void main(String[] args) {

        double[] a=null;
        long time3 = System.currentTimeMillis();
        change1(a, 50);
        long time4 = System.currentTimeMillis();
        System.out.println("这种算法使用了"+ (time4-time3) +"的时间");
        long time5 = System.currentTimeMillis();
        change2(a, 50);
        long time6 = System.currentTimeMillis();
        System.out.println("这种算法使用了"+ (time6-time5) +"的时间");
        long time7 = System.currentTimeMillis();
        change3(a, 50);
        long time8 = System.currentTimeMillis();
        System.out.println("这种算法使用了"+ (time8-time7) +"的时间");
    }


    //第一种随机数生成算法
    public static void change1(double[] a,int length) {
        a=new double[length];
        for (int i = 0; i < a.length; i++) {
            a[i]= Math.random()*a.length;
            a[i]=a[i]-a[i]%1;
            for (int j = 0; j <i; j++) {
                if(a[i]==a[j])
                i--;
            }

        }
        bianlishuchu(a);

    }


    //第二种算法
    public static void change2(double[] a,int length) {
        a=new double[length];
        Boolean[] check=new Boolean[length];
        for (int i = 0; i < check.length; i++) {
            check[i]=false;
        }

        for (int i = 0; i < a.length; i++) {
            a[i]= Math.random()*a.length;
            a[i]=a[i]-a[i]%1;
            while(check[(int) (a[i])]==true){
                a[i]= Math.random()*a.length;
                a[i]=a[i]-a[i]%1;
            }
            check[(int) (a[i])]=true;
        }
        bianlishuchu(a);

    }

    //第三种算法
    public static void change3(double[]a,int length) {
        a=new double[length];
        for (int i = 0; i < a.length; i++) {
            a[i]=i;
        }
        for (int i = 0; i < a.length; i++) {
            double k=Math.random()*a.length;
            k-=k%1;
            double x=a[i];
            a[i]=a[(int)k];
            a[(int)k]=x;
        }
        bianlishuchu(a);
    }

    //封装遍历数组
    public static void bianlishuchu(double[] a) {
        double sum=0;
        for (double d : a) {
            sum+=d;
        }
        System.out.println(sum);
        for (int j2 = 0; j2 < a.length; j2++) {
            System.out.println(a[j2]+"      "+j2);
        }
        
    }


}