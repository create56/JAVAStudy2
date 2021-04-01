package chapter4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Passenger {
	public static void main(String[] args) {
		
		List<Passenger>passengerLisst = new ArrayList<>();
		Passenger passenger1 = new Passenger("홍길동", "010-1473-3968","이코노미");
		Passenger passenger2 = new Passenger("홍길동", "010-1473-3968","이코노미");
		Passenger passenger3 = new Passenger("홍길동", "010-1473-3968","이코노미");
		
		
		
		passengerList.add(passenger1);
		int [] arr = {1,2,3,4,5};
		
	Inerator<passenger> it = passengerList.iterator();
	while(it.hasNext) {
		passenger p1 = it.next();
		System.out.println(p1.get);
	}
	
	// 비어있나요? -> true /그렇지 않으면 false
	
	// 컬렉션 프레임워크에 들어있는요소 개수를 반환
	// i가 0으로 시작해서 X로 끝난다
	// 향상된 for문 / foreach문
	
	
	}

	@Override
	public int hashCode() {
		// String 클래스에 구현되어있는 HashCode 를 적극적으로 활용하면 
		// 쉽게 간편하게 우리에게 필요한 해시함수를 만들 수 있다
		
		// String 클래스의 hashcode 메서드
		// 문자열을 해시화함
		int hasCode = name.hashCode() + tel.hashCode() + seat.hashCode();
		
		if (name.equal("홍길동")) {
			hashCode += 1;
		}
		if (te1.equals("010-7591-8524")) {
			hashCode += 2;
			
		}
		if (seat.equals("이코노미")) {
			hashCode += 3;
		}
		
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Passenger) {
		
			// 매개변수로 전달받은 객체를 passenger 클래스 타입으로 반환할 수 있다면
			Passenger target = (Passenger) obj;
			
			return this.hashCode() == obj.hashCode();
 		} else {
			// 매개변수로 전달반은 객체를 Passenger 클래스 타입으로 변환할 수 없다면
			// false
			return false;
		}
		
	}
	
	
}
	