package chapter2;

import java.text.DecimalFormat;

public class Ex5 {

	public static void main(String[] args) {
	int balance = 1278455091;
	
	// #(��)- 10����,.(��) -�Ҽ���������,  ,(�޸�)-�޸� ���� �� ��ü
	DecimalFormat df = new DecimalFormat("#,###");//���ڸ�
	String data = df.format(balance);
	System.out.println(df.format(balance));
	
	double avg = 87.53710297;
	
	df = new DecimalFormat("#");//�����״�� ��� #.##�� ���ڸ�
	System.out.println(df.format(avg));
	
	}

}
