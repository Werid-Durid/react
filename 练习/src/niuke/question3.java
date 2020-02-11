package niuke;

import java.util.HashSet;

public class question3 {
	 public static void main(final String[] args) {
		final int count = 0;
		final HashSet s = new HashSet();
		for (int i = 0; i < 6; i++) {
			for (int a = 0; a < 5; a++) {

				for (int b = 0; b < 7; b++) {
					final int c = 8 * i + 10 * a + 18 * b;
		                   
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
