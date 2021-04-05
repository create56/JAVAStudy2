package chapter5;

public enum BirthMonth {
	// ���ڷ� �����Ҽ� ����
	// �������� ����Ѵ�
	// ���� ���ڿ� ���ڸ� ���� �ִ�.
	jan("1��"), Feb("2��"), Mar("3��"), Apr("4��"), May("5��"),
	Jun("6��"), Jul("7��"), Aug("8��"), Sep("9��") , Oct("10��"),
	Nov("11��"), Dec("12��");
	
	
	private final String korMonth;
	BirthMonth(String korMonth) {
		this.korMonth = korMonth;
	}
	
	public String getkorMonth() { //������ ����� ��밡��
		return korMonth;
	}
	
	public static BirthMonth getBirthMonth(String month) {
	BirthMonth[] genderArr = BirthMonth.values();
	
	BirthMonth result = null;
		
		for (BirthMonth birthMonth : genderArr) {
			// n��° ����� ���� �ִ� �������� xx�� ���ڿ��� ����
			String korMonth = birthMonth.getkorMonth();
			
			if (month.equals(korMonth)) {
				result = birthMonth;
		}
	 }
  }
}