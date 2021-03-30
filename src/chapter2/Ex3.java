package chapter2;

import java.util.Calendar;

public class Ex3 {
	public static void main(String[] args) {
		static final int DAY_IN_SECOND = 24 * 60 * 60;
		static final int HOUR_IN_SECOND = 24 * 60* 60;
		static final int MINUTE_IN_SECOND  = 24 *
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		
		// Calendar�� ���� 0���� ī������
		cal1.set(2021, Calendar.JANUARY, 1);
		cal2.set(2021, Calendar.JANUARY, 2);
		
		long cal1ToSecond = cal1.getTimeInMillis();
		long cal2ToSecond = cal2.getTimeInMillis();
		
		long difference = cal2ToSecond - cal1ToSecond;
		difference = difference / 1000;
		
		System.out.println(difference + "�ʰ� ��Ƚ��ϴ�");
		
		int peroid = (int) (difference /(DAY_IN_SECOND));
		System.out.println(peroid + "�� ���");
		
		int peroid2 =(int) (difference / HOUR_IN_SECOND);
		System.out.println(peroid2 + "�ð� ���");
		
		int period3 = (int) (difference / MINUTE_IN_SECOND);
		System.out.println(peroid2 + "�� ���");
		
	}

}
