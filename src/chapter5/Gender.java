package chapter5;

public enum Gender {
	// ������ �ڵ����� 
	// �׷��� values ��°������
	MALE, FEMALE;
	
	public static Gender getaGender(int value) {
		if (value == 1) {
			return Gender.MALE;
		} else if(value == 2) {
			return Gender.FEMALE;
		} else {
			throw new IllegalArgumentException();
		}
		
	}
	
}
