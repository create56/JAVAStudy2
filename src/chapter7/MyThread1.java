package chapter7;

public class MyThread1 implements Runnable {
	@Override
	public void run() {
		long[] time = new long[2];
		
		// ù ���� �۾��� �����ϱ� ���� �ð�
		long start = System.currentTimeMillis();
		
		int count = 0;
		for (int i = 0; i < 100000; i++) {
			count++;
			
			if (count % 50 == 0) {
				System.out.println();
			} // end if
			
			System.out.println("|");
		}// end for
		
		// ù ��° �۾� ���� �ð�
		long end = System.currentTimeMillis();
		
		time[1] = end - start;
		
		System.out.println("�ҿ�ð�1 = " + time[0]);
		System.out.println("�ҿ�ð�2 = " + time[1]);
	}

}
