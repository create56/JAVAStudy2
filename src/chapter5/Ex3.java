package chapter5;

public class Ex3 {

	public static void main(String[] args) {
		String birth = "Jan";
		
		// �Ű������� ����� �̸��� �����ؼ�
		// �Ű������� ���޹��� �̸��� ���� �ִ� ����� ã�� �� ����
		try {
			BirthMonth birthMonth = BirthMonth.valueOf(birth);
			System.out.println(birthMonth);	
			System.out.println(birthMonth.getkorMonth());
		} catch (IllegalArgumentException e) {
			System.out.println("�������� ���� ����Դϴ�");
		}
	}

}
