package chapter5;

public enum BirthMonth {
	// 숫자로 시작할수 없다
	// 영문으로 써야한다
	// 옆에 숫자와 문자를 쓸수 있다.
	jan("1월"), Feb("2월"), Mar("3월"), Apr("4월"), May("5월"),
	Jun("6월"), Jul("7월"), Aug("8월"), Sep("9월") , Oct("10월"),
	Nov("11월"), Dec("12월");
	
	
	private final String korMonth;
	BirthMonth(String korMonth) {
		this.korMonth = korMonth;
	}
	
	public String getkorMonth() { //각각의 상수를 사용가능
		return korMonth;
	}
	
	public static BirthMonth getBirthMonth(String month) {
	BirthMonth[] genderArr = BirthMonth.values();
	
	BirthMonth result = null;
		
		for (BirthMonth birthMonth : genderArr) {
			// n번째 상수가 갖고 있는 데이터인 xx월 문자열을 저장
			String korMonth = birthMonth.getkorMonth();
			
			if (month.equals(korMonth)) {
				result = birthMonth;
			}
	}
}
