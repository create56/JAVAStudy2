package chapter7;

public class Ex1 {

	public static void main(String[] args) {
		Thread thread = new Thread(new MyThread());
		thread.start(); // 재사용 불가능 // 사용하려고 하면 컴파일 오류가 남
		
		thread = new Thread(new MyThread());
		thread.start();
	}

}
