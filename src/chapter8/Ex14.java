package chapter8;

import java.io.File;
import java.io.IOException;

public class Ex14 {
	public static void main(String[] args) {
		
		File file = new File("src\\chapter8\\test.java"); 
		// exist -> 파일 또는 디렉토리의 존재 여부 / 존재-true , 존재하지않으면-false
		// isFile -> 해당 객체가 갖고 있는 정보가 파일의 정보라면은 true ,디렉토리의 정보라면은 false
		
		if (file.exists() == false || file.isFile()) {
			System.out.println("존재하지 않거나 파일이 아닙니다");
			
			System.out.println("해당 경로에 파일을 생성합니다");
			
			try {
				boolean result = file.createNewFile();// <- 파일이름을 지정하면 컴파일 오류가 난다.
				if (result) {
					System.out.println("파일을 생성했습니다");
				} else {
					System.out.println("파일을 생성하지 못했습니다");
				}
			} catch (IOException e) {
				e.printStackTrace();				
			}
		} else {
			System.out.println("존재합니다");
		}
		
	}

}
