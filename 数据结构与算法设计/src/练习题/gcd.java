package 练习题;
public class gcd {
    public static void main(String[] args) {
        System.out.println(gcd2(50,15)); 
        System.out.println(isOdd(16));
    }
    
    private static boolean isOdd(int i) {
        return ((i%2==1)?true:false);
    }

    public static int gcd2(int m, int n) {

        while(n!=0){
            int rem=m%n;
            m=n;
            n=rem;
        }
        return m;
    }
    
}