package chapter3;

public class Ex1 {
	public static void main(String[] args) {
		ClassName <object> object1 = new ClassName <>();
		ClassName <String> object2 = new ClassName <>();
		
		ClassName <Integer> object3 = new ClassName<>();
		ClassName <Double>  object4 = new ClassName<>();
		// <>�ȿ� � Ÿ���� �ְ� ClassName��� T�ڸ��� String�� ����
		
		
//		Person<String> p1 = new Person<String>();
//		Person<String> p2 = new Person<>();
		
		// ���׸��� �ڸ����� �⺻ ������ Ÿ���� ���� ����.
		// ���׸� Ÿ�� �ڸ����� Ŭ������ �� ���� �ִ�.
		// �⺻ ������ Ÿ���� Ŭ������ ����� �ξ���.
		// ����, �Ǽ�, ���ڸ�, ���׸� Ÿ�� �ڸ��� ������
		// �⺻ ������ Ÿ���� Ŭ������ ������ Ŭ������ ����ؾ��Ѵ�.
//		Person<Integer> p3 = new Person<>();
//		
//		p3.setID(10);
//		
//		int ID = p3.getID();
		
		Person<String ,Integer> p1 = new Person<>("010-1234-5678");
		Person<Integer ,String> p2 = new Person<>(1012345678);

	}

}
