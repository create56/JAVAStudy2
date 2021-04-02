package chapter4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex11 {
	public static void main(String[] args) {
		Map<String, String> hashMap = new HashMap<>();
		
		hashMap.put("홍길동", "이코노미");
		hashMap.put("김철수", "퍼스트");
		hashMap.put("고영희", "비즈니스");
		hashMap.put("유노윤호", "퍼스트");
		hashMap.put("황광희", "이코노미");
		
		//데이터 추가
		hashMap.put("유노윤호", "이코노미");
		
		System.out.println(hashMap);
		
		// 데이터 제거
		hashMap.remove("황광희");
		
		System.out.println(hashMap);
		
		// keySet이용 출력
		Set<String> keySet = hashMap.keySet();
		Iterator<String> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			
			System.out.println(key + "=" +hashMap.get(key));
		}

	}

}
