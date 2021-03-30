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
		
		// 초 단위 차이
		long second = duration.get(ChronoUnit.SECONDS);
//		long hour = second / 3600;
//		long minute =(second- (hour * 3600)) / 60;
//		second = second -(hour * 3600) - (minute * 60);
//		
//		System.out.println(hour + "시간" + minute + "분" + second + "초 차이");
		
		// 나노초 단위 차이 / 밀리초(1/100), 마이크로초(1/1000000), 나노초(1/1000000000)
		long nano = duration.get(ChronoUnit.NANOS);
		
		// 0시 0분 0초 정보를 갖고 있는 객체 생성
		LocalTime time = LocalTime.of(0, 0, 0);
		// 초 단위 차이 만큼 초를 더함
		time = time.plusSeconds(second);
		
		System.out.println(time.getHour() + "시간" + time.getMinute() + "분" + time.getSecond() + "초 차이");
	
		
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
