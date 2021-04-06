package chapter8;

import java.io.File;

public class Ex13 {
	public static void main(String[] args) {
//		String path = "src\\chapter8"; // 상대경로
		File directroy = new File("src\\chapter8\\");
		//D: -> 절대경로 지우면 상대경로
		String fileName = "Ex13.java";
		File file = new File(directroy, fileName);
		
		int position = fileName.lastIndexOf("."); // 가장 마지막 문자에 인덱스 번호를 출력한다.
		
		
		System.out.println("경로를 제외한 파일이름 - " + fileName);
		// substring -> 문자열을 잘라주는 메서드
		System.out.println("확장자를 제외한 파일 이름 - " + fileName.substring(0, position));
		System.out.println("확장자 -  " + fileName.substring(position +1));
		System.out.println();
		
		System.out.println("경로를 포함한 파일 이름 - " + file.getPath());
		System.out.println("파일을 절대 경로 - " + file.getAbsolutePath());
		System.out.println("파일이 속해 있는 디렉토리 - " + file.getParent());
		System.out.println();
		
		System.out.println("user.dir - " + System.getProperty("user.dir"));
		
		
	}

}
