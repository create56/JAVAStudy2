package chapter1;

public class Ex2 { //매서드안에서 예외처리를 해야한다.
	static double div(int val1 , int val2) {
		
		try {
			double result = val1 / val2;
			
			return result;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			
			return 0;
		}
	}
	
	static int readArrayElement(int index) throws ArrayIndexOutOfBoundsException {
		// WrongIndexException 예외는 매서드 내부에서 처리를 하고
		// ArrayIndexOutOfBoundsException 예외는 메서드를  호출한쪽으로 처리
		try {
			int array[] = {9,8,7};
			if (index < 0) {
				throw new WrongIndexException("인덱스는 0 또는 양의 정수만 가능");
			}
			
			return array[index];
		} catch (WrongIndexException e) {
			System.out.println(e.getMessage());
		
		return 0;
	}
}
	static void makeException() throws MyException {
		System.out.println("makeException 실행"); //makeException()에 boolean
		
		throw new MyException("내가 만든 예외 발생"); //System.out.println("makeException 종료");
		
	}
		
	public static void main(String[] args) {
		double result1 = div(10,0);
		
		// readArrayElement가 예욀르 던지는데 처리(try - catch)하지 않았음에도 컴파일 오류가 발생하지 않음
		try {
			int result2 = readArrayElement(3);
			System.out.println(result1);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} 
		
		// makeException이 예외를 던지는데도 
		try {
			makeException();			
		} catch (MyException e) {
			System.out.println("makeException 메서드가 예외를 던짐");
		}
	
	}

}
