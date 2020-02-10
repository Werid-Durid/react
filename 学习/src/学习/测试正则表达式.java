package 学习;

import java.util.regex.Pattern;

public class 测试正则表达式 {
	public static void main(String[] args) {
		
		String content="I am a student from gnnu";
		
		String pipei=".*gnnu.*";
		
		boolean isMatch=Pattern.matches(pipei,content);
		
		System.out.println("字符串中是否包含了gnnu字符？"+isMatch);
	}

}
