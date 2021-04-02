package chapter5;

import java.util.Iterator;

public class Ex1 {
	public static void main(String[] args) {
		System.out.println(Gender.MALE);
		System.out.println(Gender.FEMALE);
		
		
		Gender[] genderArr = Gender.values();
		for (int i = 0; i < genderArr.length; i++) {
			Gender gender = genderArr[i];
			System.out.println(genderArr[i]);
		}
		
		for (Gender gender : genderArr) {
			System.out.println(gender);
		}
	}

}
