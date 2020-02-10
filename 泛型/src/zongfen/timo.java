package zongfen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class timo {
public static void main(String[] args) {
	List<student> stulist=test();
	Map<String, classroom> map=count(stulist);
	view(map);
	System.out.println();
	
}

//�鿴�ɼ����ܷ�
public static void view(Map<String,classroom> map){
	Set<String> keys=map.keySet();
	
	Iterator<String> keys1=keys.iterator();
	
	while(keys1.hasNext()) {
		String no=keys1.next();
		classroom room=map.get(no);
		double total=room.getTotal();
		double avg=total/room.getStulist().size();
		
		System.out.println(no+"-->"+total+"-->"+avg);
	}
	
}






//ͳ�Ʒ���
public static Map<String,classroom> count(List<student> student1){
	Map<String,classroom> map=new HashMap<String,classroom>();
	
	//����student1
	for(student stu:student1) {
		//�༶��źͳɼ�
		String no=stu.getNo();
		double score=stu.getScore();
		//�����༶
		classroom room=map.get(no);
		
		if(null==room) {
			room=new classroom();
			map.put(no, room);
			
		}
		room.getStulist().add(stu);
		room.setTotal(room.getTotal()+score);
	}
	
	
	return map;
	
}



public static List<student> test(){
	List<student>  student1=new ArrayList<student>();
	student1.add(new student("gao",80,"a"));
	student1.add(new student("gao1",82,"a"));
	student1.add(new student("gao2",83,"a"));
	student1.add(new student("gao3",84,"b"));
	student1.add(new student("gao4",85,"b"));
	return student1;
}
}
