package chapter2;

import java.util.Calendar;
import java.util.Date;

public class Ex1 {
	public static void main(String[] args) {
		// �ڹ�1 �������� ����ߴ� ��¥�� �ð��� �ڵ鸵�ϴ� Ŭ����
		Date date = new Date();
		// �ڹ�1.1�������� �߰��� ��¥�� �ð��� �ڵ鸵�ϴ� Ŭ����
		// Calendar Ŭ������ �߻� Ŭ�����̹Ƿ� �ν��Ͻ��� ���� ������
		// ��� Calendar Ŭ������ �ִ� static �޼����� getInstance�� ����ؼ�
		// Calendar Ŭ������ �ڽ� Ŭ���� �ν��Ͻ��� ���� �� ����
		// ���α׷��� �����Ǵ� �ý����� ������ ���� ������ Ȯ���ؼ�
		// �ش� �ý��ۿ� �´� ��¥�� �ڵ鸵 �� ���ִ� Ŭ������ �ν��Ͻ��� ��ȯ�ȴ�.
		// �׷�����(�±��� �ٸ� ����), �ҷ�(�±�) 
		Calendar calendar = Calendar.getInstance();
		
		
		// Data Ŭ������ �ν��Ͻ� -> Calendar Ŭ������ �ν��Ͻ��� ��ȯ
		//1. Calendar Ŭ������ �ν��Ͻ��� �����Ѵ�.
		//2. 1���� ������ Calendar Ŭ������ �ν��Ͻ��� ��¥�� �ð���
		//  Date Ŭ������ �ν��Ͻ��� ���� �ִ� ��¥�� �ð����� �����Ѵ�.
		calendar.setTime(date);
		
		//Calendar Ŭ������ �ν��Ͻ� -> Date Ŭ������ �ν��Ͻ��� ��ȯ
		Date d1 = new Date(calendar.getTimeInMillis());
		Date d2 = calendar.getTime();
		

	}

}
