package chapter2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class Ex8 {
	public static void main(String[] args) {
//		LocalDate date = LocalDate.now();
//		LocalTime time = LocalTime.now();
		LocalDate today =LocalDate.now();
		LocalDate yesterday = today.minusDays(1);
		
		System.out.println(today.isAfter(yesterday));
		System.out.println(today.isBefore(yesterday));
		
		System.out.println(yesterday.isAfter(today));
		System.out.println(yesterday.isBefore(today));
		
		
		
//		System.out.println(date.plusYears(1));
//		System.out.println(date.plusMonths(5));
//		System.out.println(date.plusDays(21));
//		System.out.println(date.minusDays(21));
//		
//		System.out.println(time.plusHours(2));
		
		// date ��ü�� Year �ʵ� ���� 2022�� �ٲ��
		// date ��ü�� ���� �ִ� ��, �� ���� �״�� �����ϰ� Year �ʵ��� ���� 2022�� �ٲ㼭
		// year -2022, month- date��ü�� ���� �ִ���, day -date��ü�� ���� �ִ� �� / �� ���� �ִ�
		// ���ο� LocalDate ��ü�� ��ȯ
//		date.with(ChronoField.YEAR,2022);
//		LocalDate newDate = date.with(ChronoField.YEAR,2022);
//		System.out.println(newDate);
//		
//		System.out.println(date.with(ChronoField.MONTH_OF_YEAR, 7));
//		
//		System.out.println(date.with(ChronoField.DAY_OF_MONTH, 21));
//		
//		System.out.println(time.with(ChronoField.HOUR_OF_DAY,11));
//		
//		System.out.println(time.with(ChronoField.MINUTE_OF_HOUR,38));
//		
//		System.out.println(time.with(ChronoField.SECOND_OF_MINUTE,7));
	
//		System.out.println("�� :" +  time.getHour());
//		System.out.println("�� :" +  time.getMinute());
//		System.out.println("�� :" +  time.getSecond());
		
		
//		
//		System.out.println("���� = " + date.getYear());
//	
//		System.out.println("�̹��� = " + date.getMonthValue());
//		System.out.println("�̹��� = " + date.getMonth());
//		
//		System.out.println("������ ��¥ = " + date.getDayOfMonth());
//		System.out.println("1�� 1�Ϻ��� ����� �ϼ� = " + date.getDayOfYear());
//
//		System.out.println("������ ����= " + date.getDayOfWeek());
//		System.out.println("�̹� ���� �ϼ�= " + date.lengthOfMonth());
//		System.out.println("������ �ϼ�= " + date.lengthOfYear());
//		System.out.println("������ ���� ����= " + date.isLeapYear());
	}

}
