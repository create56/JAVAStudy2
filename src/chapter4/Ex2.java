package chapter4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public class Ex2 {
	public static void main(String[] args) {
		// ArrayList, LinkedList ,stack, vector 등
		// 집에가서 승객 리스트 작성마져하기
		// ArrayList 특징 - 중간에 삽입, 삭제가 빈번한 상황에서는 부적합한 자료구조
		//              맨뒤에서 삽입 삭제가 빈번한 상황에서는 적합한 자료구조
		List<Passenger> passengerList = new ArrayList<>();
		
		
		
		List<String> arrayList = new ArrayList<>();
		arrayList = new LinkedList<>();
		arrayList.add("A");
		arrayList.add("C");
		arrayList.add("E");
		arrayList.add("D");
		System.out.println("초기 상태 :" + arrayList);
		
		arrayList.add(1,"B");
		System.out.println("인덱스1위치에 B추가 :" +arrayList);
		
		arrayList.add(3,"D");
		System.out.println("인덱스3위치에 D추가 :" +arrayList);
		
		arrayList.remove(2);
		System.out.println("인덱스2위치에 값 삭제 :" +arrayList);
		
		arrayList.remove(4);
		System.out.println("인덱스4위치에 값 삭제 :" +arrayList);
		                   
		System.out.println("인덱스2위치에 값 반환 :" +arrayList.get(2));	
		System.out.println("인덱스3위치에 값 반환 :" +arrayList.get(3));	
	}
	
}


	

