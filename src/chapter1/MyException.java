package chapter1;


// ������ ���� Ŭ������ ����
// MyException�� ArrayIndexoutofBoundsException  ��� ������ ���ܰ� �ȴ�
public class MyException extends RuntimeException { // ��Ÿ�� ���ܴ� �߻��ϴ� �׋� ó���� ���ָ�ȴ�.
	// ����ȭ 
	private static final long serialVersionUID = -2103221287283272330L; // ���ܸ� ���� ���鋚�� �� �߰��ϱ�!!!
	
	// msg : ���ܰ� �� �߻��ߴ���, ������
	public MyException(String msg) {
		super(msg);
	}
	
	
	
}
