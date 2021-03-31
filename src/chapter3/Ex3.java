package chapter3;

public class Ex3 {
	public static void main(String[] args) {
		Integer intValue = Integer.valueOf(10); 
		System.out.println(intValue.intValue());
		
		// 오토박싱
		// intValue1은 객체라는점을 잊으면 안된다. 
		Integer intValue1 = 10;
		System.out.println(intValue);
		
		//오토언박싱
		int num1 = intValue1;// 일반적으로 할당 불가능하지만 오토언박싱이 되어서 사용가능!! 
		
		
		Double doubleValue =3.14;
		System.out.println(doubleValue);
		
		Character charValue = 'a';
		System.out.println(charValue);
		
		String str1 = new String("안녕하세요");// 원래는 이렇게 사용하지만 오토박싱이 되어 적용 가능
		String str = "안녕하세요";
		System.out.println(str);
	}

}
  