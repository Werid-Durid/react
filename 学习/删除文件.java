package 学习;

import java.io.File;

public class 删除文件 {
	public static void main(String[] args) {
		//路径在这里
		String lujin="C:\\Users\\DELL\\Desktop\\测试用\\测试专用\\新建文件夹";
		//需要注意主文件也会被删除
		File f=new File(lujin);
		
		deletewenjianjia(f);
		
	}

	
	//主函数
	public static void deletewenjianjia(File f) {
		File[] fdetails=f.listFiles();
		if(fdetails!=null) {
			for(File f1:fdetails) {
				if(f1.isDirectory()) {
					//递归
					deletewenjianjia(f1);
					
				}else {
					f1.delete();
					
					//测试删除成功输出
					System.out.println(f1+"删除成功!");
				}
				
			}
		}
		//最后删除主文件
		f.delete();
	}
	
}
