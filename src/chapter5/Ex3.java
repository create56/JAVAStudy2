package chapter5;

public class Ex3 {

	public static void main(String[] args) {
		String birth = "Jan";
		
		// 매개변수로 상수를 이름을 전달해서
		// 매개변수로 전달반은 이름을 갖고 있는 사수를 찾을 수 있음
		try {
			BirthMonth birthMonth = BirthMonth.valueOf(birth);
			System.out.println(birthMonth);	
			System.out.println(birthMonth.getkorMonth());
		} catch (IllegalArgumentException e) {
			System.out.println("존재하지 않은 상수입니다");
		}
	}

}
