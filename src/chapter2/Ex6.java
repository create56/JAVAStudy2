package chapter2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex6 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		Date date = calendar.getTime();
		
		
		SimpleDateFormat sdf;// sdf으로 많이 사용
		//y-> 년 m -월 d - 일
		// yyyy - 년을 출력하는데 4자리로 출력해라
		// mm - 월을 출력하는데ㅐ 두자릿수 월로 출력해라
		// dd - 일을 출력하는데 두자릿수 일로 출력해라
		sdf = new SimpleDateFormat("yyy-MM-dd");
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("yy년-M월-d일");
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("yy년-M월-d일 HH:mm:ss");
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("yy년-M월-d일 H:m:s");
		System.out.println(sdf.format(date));
		

		sdf = new SimpleDateFormat("yy년-M월-d일 H:m:s.SSS");
		System.out.println(sdf.format(date));

		sdf = new SimpleDateFormat("yy년-M월-d일 H:m:s.SSS a");
		System.out.println(sdf.format(date));
		
		
	}

}
