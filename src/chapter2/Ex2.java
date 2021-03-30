package chapter2;

import java.util.Calendar;

public class Ex2 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		System.out.println("�� �� :" +calendar.get(Calendar.YEAR));
		//Calendar Ŭ������ ���� 0���� ����.
		// 0~11������ �����ϹǷ� ����ҋ��� 1�� ���ؼ� ����ؾ��Ѵ�.
		System.out.println("�̹� �� :" +(calendar.get(Calendar.MONTH)+1));
		System.out.println("������ �̹� �� ���� : " + calendar.get(Calendar.WEEK_OF_MONTH));
		
		//�̹����� ������ ��¥
		System.out.println("������ ��¥ :" + calendar.get(Calendar.DAY_OF_MONTH));
		// ������ ������ ��¥(1��1�� ����)
		System.out.println("������ ��¥ :" + calendar.get(Calendar.DAY_OF_YEAR));
		
		// 1-�Ͽ��� 7-����� 
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		String[] weekName = {"", "�Ͽ���","������","ȭ����","������","�����","�ݿ���","�����"};
		System.out.println("������ ���� :"+ weekName[dayOfWeek]);
		
		
		
		System.out.println("�� :" + calendar.get(Calendar.HOUR));
		System.out.println("�� :" + calendar.get(Calendar.MINUTE));
		System.out.println("�� :" + calendar.get(Calendar.SECOND));

		System.out.println("�̴��� ������ �� :" + calendar.getActualMaximum(Calendar.DATE));


		
	}

}
