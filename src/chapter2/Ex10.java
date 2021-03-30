package chapter2;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class Ex10 {
	public static void main(String[] args) {
		ZonedDateTime zdt = ZonedDateTime.now();
		
		System.out.println(zdt);
		
		ZoneOffset kroffset = zdt.getOffset();
		System.out.println(kroffset);
		
		ZoneId nyId = ZoneId.of("America/New_York");
		zdt = ZonedDateTime.now().withZoneSameInstant(nyId);
		
		System.out.println(zdt);
		
		ZoneOffset nyOffset =zdt.getOffset();
		System.out.println(nyOffset);
		
		// ���� �ý����� ��¥�� �ð��� ���� ��ü
//		LocalDateTime dateTime = LocalDateTime.now();
		
		//�ѱ��� �ð���
		// Asia/Seoul ->����
		// Asia/japan ->����
		// Ÿ����, �ð��� ,zone id
		
//		ZoneId zoneId = ZoneId.of("Asia/Seoul");
		
		// dateTime ��ü�� ���� �ִ� ��¥�� �ð��� Asia/Seoul�� ��¥�� �ð��̶�� ǥ�� ����
		// 2021-03-30 16:49:12 ������ �ð��̴�.
//		ZonedDateTime zdt = dateTime.atZone(zoneId);
//		
//		System.out.println(dateTime);
//		System.out.println(zdt);
//		
	
	}

}
