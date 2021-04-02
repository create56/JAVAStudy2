package chapter5;

public enum Gender {
	// 컴파일 자동생성 
	// 그래서 values 라는것을사용
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
