package Á·Ï°1;

public class Á·Ï°Ìâ2 {
	int[] a= {31,30,31,30,31,30,31,31,30,31,30,31};
	    public static void main(String[] args) {
	        int sy = 2014;
	        int sm = 11;
	        int sd = 9;
	        int day = 1000;
	        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	        while(day>365) {
	            sy++;
	            if(sy%4!=0) day -= 365;
	            else day -= 366;
	        } 
	        while(day>=days[sm]){
	            day -= days[sm];
	            sm++;
	            if(sm>12) {
	                sm -= 12;
	                sy++;
	            }       
	        }
	        sd += day;
	        if(sd>=days[sm]) {
	            sd -= days[sm];
	            sm++;
	        }
	        if(sm>12) {
	            sm -= 12;
	            sy++;
	        }
	        System.out.println(sy+"-"+sm+"-"+sd);
	        

	    }
	}


