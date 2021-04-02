package chapter5;

public class Ex7 {
	@Deprecated
	public static final int oldValue = 10;
	
	@Deprecated
	public static void oldMethod() {
		System.out.println("old");
	}
	public static final int newValue = 11;
	
	public static void newMethod() {
		System.out.println("new");
	}
	
	public static void main(String[] args) {
		System.out.println(Ex7.oldValue);
		Ex7.oldMethod();
		
		System.out.println(Ex7.newValue);
		Ex7.newMethod();

	}

}
