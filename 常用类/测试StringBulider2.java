package 常用类;



/**
 * @author DELL
 *
 */
public class 测试StringBulider2 {

		String str="";
		
		long num1=Runtime.getRuntime().freeMemory();//获取系统剩余内存时间

		long num2=System.currentTimeMillis();//获取系统当前时间
		
//		这样生成的对象太多，会导致卡顿卡死
//		for(int i=0;i<500;i++) {
//			str=str+i;
//		}
		
		
		
		
		
		
	    public static void main(String[] args) {
	        /**使用String进行字符串的拼接*/
	        String str8 = "";
	        //本质上使用StringBuilder拼接, 但是每次循环都会生成一个StringBuilder对象
	        long num1 = Runtime.getRuntime().freeMemory();//获取系统剩余内存空间
	        long time1 = System.currentTimeMillis();//获取系统的当前时间
	        for (int i = 0; i < 500; i++) {
	            str8 = str8 + i;//相当于产生了10000个对象
	        }
	        long num2 = Runtime.getRuntime().freeMemory();
	        long time2 = System.currentTimeMillis();
	        System.out.println("String占用内存 : " + (num1 - num2));
	        System.out.println("String占用时间 : " + (time2 - time1));
	        /**使用StringBuilder进行字符串的拼接*/
	        StringBuilder sb1 = new StringBuilder("");
	        long num3 = Runtime.getRuntime().freeMemory();
	        long time3 = System.currentTimeMillis();
	        for (int i = 0; i < 500; i++) {
	            sb1.append(i);
	        }
	        long num4 = Runtime.getRuntime().freeMemory();
	        long time4 = System.currentTimeMillis();
	        System.out.println("StringBuilder占用内存 : " + (num3 - num4));
	        System.out.println("StringBuilder占用时间 : " + (time4 - time3));

	        

	    }

	    
//	    	    		测试StringBulider x=new 测试StringBulider();
//	        	employee e=x.new employee("sada",1);
//	    		System.out.println(e.getName());
//	    
//	    
//	    	class employee{
//		    String name;
//			int sex;
//			public employee(String name, int sex) {
//				super();
//				this.name = name;
//				this.sex = sex;
//			}
//			public String getName() {
//				return name;
//			}
//			public void setName(String name) {
//				this.name = name;
//			}
//			public int getSex() {
//				return sex;
//			}
//			public void setSex(int sex) {
//				this.sex = sex;
//			}
//
//		}	    


			
}
