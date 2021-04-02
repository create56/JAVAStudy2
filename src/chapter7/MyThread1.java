package chapter7;

public class MyThread1 implements Runnable {
	@Override
	public void run() {
		long[] time = new long[2];
		
		// 첫 번쨰 작업을 시작하기 전의 시간
		long start = System.currentTimeMillis();
		
		int count = 0;
		for (int i = 0; i < 100000; i++) {
			count++;
			
			if (count % 50 == 0) {
				System.out.println();
			} // end if
			
			System.out.println("|");
		}// end for
		
		// 첫 번째 작업 후의 시간
		long end = System.currentTimeMillis();
		
		time[1] = end - start;
		
		System.out.println("소요시간1 = " + time[0]);
		System.out.println("소요시간2 = " + time[1]);
	}

}
