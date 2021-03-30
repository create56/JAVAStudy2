package chapter1;

public class Ex2 { //�ż���ȿ��� ����ó���� �ؾ��Ѵ�.
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
		// WrongIndexException ���ܴ� �ż��� ���ο��� ó���� �ϰ�
		// ArrayIndexOutOfBoundsException ���ܴ� �޼��带  ȣ���������� ó��
		try {
			int array[] = {9,8,7};
			if (index < 0) {
				throw new WrongIndexException("�ε����� 0 �Ǵ� ���� ������ ����");
			}
			
			return array[index];
		} catch (WrongIndexException e) {
			System.out.println(e.getMessage());
		
		return 0;
	}
}
	static void makeException() throws MyException {
		System.out.println("makeException ����"); //makeException()�� boolean
		
		throw new MyException("���� ���� ���� �߻�"); //System.out.println("makeException ����");
		
	}
		
	public static void main(String[] args) {
		double result1 = div(10,0);
		
		// readArrayElement�� ���߸� �����µ� ó��(try - catch)���� �ʾ������� ������ ������ �߻����� ����
		try {
			int result2 = readArrayElement(3);
			System.out.println(result1);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} 
		
		// makeException�� ���ܸ� �����µ��� 
		try {
			makeException();			
		} catch (MyException e) {
			System.out.println("makeException �޼��尡 ���ܸ� ����");
		}
	
	}

}
