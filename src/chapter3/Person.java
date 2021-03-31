package chapter3;

// E - Element
// K - Key
// V - Value
// T - Type
// N - Number
// 제너릭타입을 여러개 입력가능
public class Person <T1, T2> {
	private int eye;
	private	int nose;
	private	int mouth;
		
	private	T1 id;
	private T2 te1; 
	
	public Person(T1 te1) {
		this.te1 = te1;
	}
	
	public void setTe1(T1 tal) {
		this.te1 = te1;
	}
	
	public Person(int eye, int nose, int mouth, T1 id) {
		this.eye = eye;
		this.nose = nose;
		this.mouth = mouth;
		this.id = id;		
	}
	
	public void add(T1 val1, T2 val2) {
		System.out.println(1);
	}
	
	public void setID(T1 id) {
		this.id = id;
	}
	
	public T getID() {
		return id;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
	}

	
}
