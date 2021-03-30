package chapter1;


// 나만의 예외 클래스를 만듬
// MyException이 ArrayIndexoutofBoundsException  등과 동일한 예외가 된다
public class MyException extends RuntimeException { // 런타임 예외는 발생하는 그떄 처리를 해주면된다.
	// 직렬화 
	private static final long serialVersionUID = -2103221287283272330L; // 예외를 직접 만들떄는 꼭 추가하기!!!
	
	// msg : 예외가 왜 발생했는지, 사유임
	public MyException(String msg) {
		super(msg);
	}
	
	
	
}
