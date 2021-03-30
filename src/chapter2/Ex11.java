package chapter2;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Ex11 {
	public static void main(String[] args) {
		LocalTime time1 = LocalTime.of(0, 0,0);
		LocalTime time2 = LocalTime.of(9,12,34);
		
		Duration duration = Duration.between(time1, time2);
		
		// �� ���� ����
		long second = duration.get(ChronoUnit.SECONDS);
//		long hour = second / 3600;
//		long minute =(second- (hour * 3600)) / 60;
//		second = second -(hour * 3600) - (minute * 60);
//		
//		System.out.println(hour + "�ð�" + minute + "��" + second + "�� ����");
		
		// ������ ���� ���� / �и���(1/100), ����ũ����(1/1000000), ������(1/1000000000)
		long nano = duration.get(ChronoUnit.NANOS);
		
		// 0�� 0�� 0�� ������ ���� �ִ� ��ü ����
		LocalTime time = LocalTime.of(0, 0, 0);
		// �� ���� ���� ��ŭ �ʸ� ����
		time = time.plusSeconds(second);
		
		System.out.println(time.getHour() + "�ð�" + time.getMinute() + "��" + time.getSecond() + "�� ����");
	
		
		System.out.println(second);
		System.out.println(nano);
		
//		LocalDate date1 = LocalDate.of(2020, 1, 19);
//		LocalDate date2 = LocalDate.now();
//		
//		Period period = Period.between(date1, date2);
//		System.out.println(period);
//		
//		period = Period.between(date2, date1);
//		System.out.println(period);

	}

}
