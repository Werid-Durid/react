package ѧϰ;

import java.util.regex.Pattern;

public class ����������ʽ {
	public static void main(String[] args) {
		
		String content="I am a student from gnnu";
		
		String pipei=".*gnnu.*";
		
		boolean isMatch=Pattern.matches(pipei,content);
		
		System.out.println("�ַ������Ƿ������gnnu�ַ���"+isMatch);
	}

}
