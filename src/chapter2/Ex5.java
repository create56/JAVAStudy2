package chapter2;

import java.text.DecimalFormat;

public class Ex5 {

	public static void main(String[] args) {
	int balance = 1278455091;
	
	// #(샵)- 10진수,.(점) -소수점구분자,  ,(콤마)-콤마 문자 그 자체
	DecimalFormat df = new DecimalFormat("#,###");//세자리
	String data = df.format(balance);
	System.out.println(df.format(balance));
	
	double avg = 87.53710297;
	
	df = new DecimalFormat("#");//정수그대로 출력 #.##은 두자리
	System.out.println(df.format(avg));
	
	}

}
