package chapter3;

public class Ex1 {
	public static void main(String[] args) {
		ClassName <object> object1 = new ClassName <>();
		ClassName <String> object2 = new ClassName <>();
		
		ClassName <Integer> object3 = new ClassName<>();
		ClassName <Double>  object4 = new ClassName<>();
		// <>안에 어떤 타입을 넣고 ClassName라는 T자리에 String이 들어간다
		
		
//		Person<String> p1 = new Person<String>();
//		Person<String> p2 = new Person<>();
		
		// 제네릭스 자리에는 기본 테이터 타입은 들어갈수 없다.
		// 제네릭 타입 자리에는 클래스만 올 수가 있다.
		// 기본 데이터 타입을 클래스로 만들어 두었다.
		// 정수, 실수, 문자를, 제네릭 타입 자리에 쓰려면
		// 기본 데이터 타입을 클래스로 만들어둔 클래스를 사용해야한다.
//		Person<Integer> p3 = new Person<>();
//		
//		p3.setID(10);
//		
//		int ID = p3.getID();
		
		Person<String ,Integer> p1 = new Person<>("010-1234-5678");
		Person<Integer ,String> p2 = new Person<>(1012345678);

	}

}
