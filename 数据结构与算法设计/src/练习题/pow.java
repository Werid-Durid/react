package 练习题;
public class pow{
    public static void main(String[] args) {
        System.out.println(pow2(50,3)); 
    }
    private static boolean isEven(int i) {
        return ((i%2==1)?false:true);
    }
    public static long pow2(long x,int n) {
        if (n==0) {
            return 0;
        }
        if (n==1) {
            return x;
        }
        if (isEven(n)) {
            return pow2(x*x, n/2);
        }
        else{
            return (pow2(x*x,n/2))*x;
        }
    }
}