package chapter7;

// Ŭ������ ���� -> Ʋ
// �����带 ���� -> �������� Ʋ
public class MyThread implements Runnable {
	
	@Override
	public void run() {
		// �����尡 �����ؾߵ� �۾�
		try {
			int result = 10 / 0;
			System.out.println(result);
			
		} catch (ArithmeticException e) {
			System.out.println("���� �߻�!");
		}
	}
} 
