package 练习题;

public class halfsearch{
    public static void main(String[] args) {
        //排序好的数组
        int[] a={1,1,3,5,42,45,121,15648,123456,456464};
        System.out.println(binarysearch(a, 121)); 

    }
    public static int binarysearch(int[] a,int x) {
    int low=0,high=a.length-1;
    while (high>=low) {
        int mid=(high+low)/2;
        if(a[mid]-x<0){
            low=mid+1;
        }
        else if(a[mid]-x>0)
        high=mid-1;
        else 
        return mid;
    }
    return -1;
}
}