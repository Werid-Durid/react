package 常用类;

/**
 * @author tsy
 *
 */
public class 测试StringBulider {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<26;i++) {
			sb.append(   (char)('a'+i) );
			
			
		}
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		sb.setCharAt(3, '是');
		System.out.println(sb);
		
		sb.insert(1, '我');
		System.out.println(sb);
		
		//insert会返回本身
	    //调用了return
	    //所以可以反复调用,叫链式调用
		sb.insert(1, '我').insert(2,'你');
		System.out.println(sb);
		
		
		sb.delete(20, 23);
		System.out.println(sb);
		
	
	}

}
