package chapter8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex3 {
	public static void main(String[] args) {
		// 인자를 문자열로 전달해주면 인자로 전달받은 경로에 있는 파일과 스트림을 연결
		// 절대 경로 : 최상위 경로를 포함한 파일의 위치 / 최상위 경로부터 해당 위치까지 파일을 찾음
		// 상대 경로 : 촤상위 경로를 생략한 파일의 위치 / 현재 프로그램이 실행되는 위치부터 해당 위치까지 파일을 찾음
		
		// 수업을 자료를 볼떄 예외처리 자세히 보기 // 일반적으로 catch문을 하나더 붙이거나 IOException을 사용
		FileInputStream fis = null;
		try {
			String path = D:\\eclipse-workspace3\\2021-03-29\\src\\chapter8\\Ex3.java;
			fis = new FileInputStream(path);
			while (true) {
				int data = fis.read();
				if (data == -1) {
					break;
				}
				
				char c = (char) data;
				System.out.println(c);
			}
			//스트림을 닫는게 중요하다.
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾지 못했습니다");
		} catch(IOException e) {
			System.out.println("스트림을 닫는 도중 문제가 발생하였습니다");
		} finally {
			try {
				fis.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		
		System.out.println("프로그램 끝");
			
		
	}

}
