package chapter2;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Ex12 {
	public static String toString(LocalDate date) {
		String year = date.getYear() + "��";
		String month = date.getMonthValue() + "��";
		String day = date.getDayOfMonth() + "��";

			
			return year + " " + month + " " + day;
	public static void main(String[] args) {
		LocalDate date1 = LocalDate.of(2020, 1, 9);
		LocalDate date2 = LocalDate.now();
		
	
		// 1�� 2���� 11��
//		Period period = Period.between(date1, date2);
//		// 1��
//		long year = period.get(ChronoUnit.YEARS);
//		// 2����
//		long month = period.get(ChronoUnit.MONTHS);
//		// 11��
//		long day = period.get(ChronoUnit.DAYS);
//		
//		long dayPeriod = (year * 365) + (month * 30) + day;
//		
//		long monthPeriod = (year * 12) + month;
//		
//		String date1String = toString(date1);
//		String date2String = toString(date2);
//		String periodString = year + "��" + month + "��" + day + "�� ���̰� ���ϴ�";
//		
//		System.out.println(date1String + "��" + date2String + "��" + periodString);
//		System.out.println(date1String + "��" + date2String + "��" + dayPeriod + "�� ���̰� ���ϴ�");
//		System.out.println(date1String + "��" + date2String + "�� ��" + monthPeriod + "���� ���̰� ���ϴ�");
			}
	}

}
