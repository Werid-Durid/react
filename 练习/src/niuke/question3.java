package niuke;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class question3 {
	 public static void main(String[] args){
		    int count=0;
		    HashSet s=new HashSet();
		        for(int i=0;i<6;i++){
		            for(int a=0;a<5;a++){
		                
		                for(int b=0;b<7;b++){
		                    int c=8*i+10*a+18*b;
		                   
//		                    if (!s.contains((int)c)){
//		                        count++;
//		                        System.out.println(s);
		                        s.add(c);
		                    //}
		                }
		            }
		        }
		        System.out.println(s.size()-1);
		    }

}
