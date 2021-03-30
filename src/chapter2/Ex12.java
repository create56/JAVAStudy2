package chapter2;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Ex12 {
	public static String toString(LocalDate date) {
		String year = date.getYear() + "년";
		String month = date.getMonthValue() + "년";
		String day = date.getDayOfMonth() + "년";

			
			return year + " " + month + " " + day;
	public static void main(String[] args) {
		LocalDate date1 = LocalDate.of(2020, 1, 9);
		LocalDate date2 = LocalDate.now();
		
	
		// 1년 2개월 11일
//		Period period = Period.between(date1, date2);
//		// 1년
//		long year = period.get(ChronoUnit.YEARS);
//		// 2개월
//		long month = period.get(ChronoUnit.MONTHS);
//		// 11일
//		long day = period.get(ChronoUnit.DAYS);
//		
//		long dayPeriod = (year * 365) + (month * 30) + day;
//		
//		long monthPeriod = (year * 12) + month;
//		
//		String date1String = toString(date1);
//		String date2String = toString(date2);
//		String periodString = year + "년" + month + "월" + day + "일 차이가 납니다";
//		
//		System.out.println(date1String + "은" + date2String + "과" + periodString);
//		System.out.println(date1String + "은" + date2String + "과" + dayPeriod + "일 차이가 납니다");
//		System.out.println(date1String + "은" + date2String + "과 약" + monthPeriod + "개월 차이가 납니다");
			}
	}

}
