package chapter5;

public class Ex6 {
	public static void main(String[] args) {
		int genderValue = 1;
		
	Gender gender =	Gender.getaGender(genderValue);
	System.out.println(gender);
	switch (gender) {
	case MALE:
		System.out.println("������ ���� ���� ����");
		break;
	case FEMALE:
		System.out.println("������ ���� ���� ����");
		break;
		
	}
		

	}

}
