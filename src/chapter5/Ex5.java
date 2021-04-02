package chapter5;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("남성일 경우 1"); 
		System.out.println("여성일 경우 2");
		System.out.println("성별 입력 :");
		
		int genderValue = scanf.nextInt();
		
		try {
			Gender gender =Gender.getaGender(genderValue);
			if (gender == Gender.MALE) {
				System.out.println("남성입니다");
				System.out.println("남성이");
				System.out.println("많이");
				System.out.println("구매하는");
				System.out.println("상품을");
				System.out.println("위주로");
				System.out.println("쿠폰을");
				System.out.println("지급");
			} else {
				System.out.println("여성입니다");
				System.out.println("여성이");
				System.out.println("많이");
				System.out.println("구매하는");
				System.out.println("상품을");
				System.out.println("위주로");
				System.out.println("쿠폰을");
				System.out.println("지급");
			} 
			
		} catch (IllegalArgumentException e) {
			System.out.println(genderValue + "은(는) 존재하지 않은 성별입니다");
		}
		
	}
}
