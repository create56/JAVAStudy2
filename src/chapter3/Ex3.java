package chapter3;

public class Ex3 {
	public static void main(String[] args) {
		Integer intValue = Integer.valueOf(10); 
		System.out.println(intValue.intValue());
		
		// ����ڽ�
		// intValue1�� ��ü������� ������ �ȵȴ�. 
		Integer intValue1 = 10;
		System.out.println(intValue);
		
		//�����ڽ�
		int num1 = intValue1;// �Ϲ������� �Ҵ� �Ұ��������� �����ڽ��� �Ǿ ��밡��!! 
		
		
		Double doubleValue =3.14;
		System.out.println(doubleValue);
		
		Character charValue = 'a';
		System.out.println(charValue);
		
		String str1 = new String("�ȳ��ϼ���");// ������ �̷��� ��������� ����ڽ��� �Ǿ� ���� ����
		String str = "�ȳ��ϼ���";
		System.out.println(str);
	}

}
  