package ������;

/**
 * @author tsy
 *
 */
public class ����StringBulider {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<26;i++) {
			sb.append(   (char)('a'+i) );
			
			
		}
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		sb.setCharAt(3, '��');
		System.out.println(sb);
		
		sb.insert(1, '��');
		System.out.println(sb);
		
		//insert�᷵�ر���
	    //������return
	    //���Կ��Է�������,����ʽ����
		sb.insert(1, '��').insert(2,'��');
		System.out.println(sb);
		
		
		sb.delete(20, 23);
		System.out.println(sb);
		
	
	}

}
