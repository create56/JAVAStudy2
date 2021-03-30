package chapter2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex6 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		Date date = calendar.getTime();
		
		
		SimpleDateFormat sdf;// sdf���� ���� ���
		//y-> �� m -�� d - ��
		// yyyy - ���� ����ϴµ� 4�ڸ��� ����ض�
		// mm - ���� ����ϴµ��� ���ڸ��� ���� ����ض�
		// dd - ���� ����ϴµ� ���ڸ��� �Ϸ� ����ض�
		sdf = new SimpleDateFormat("yyy-MM-dd");
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("yy��-M��-d��");
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("yy��-M��-d�� HH:mm:ss");
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("yy��-M��-d�� H:m:s");
		System.out.println(sdf.format(date));
		

		sdf = new SimpleDateFormat("yy��-M��-d�� H:m:s.SSS");
		System.out.println(sdf.format(date));

		sdf = new SimpleDateFormat("yy��-M��-d�� H:m:s.SSS a");
		System.out.println(sdf.format(date));
		
		
	}

}
