package chapter8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex4 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		// 원본 파일
		String srcPath = "D:\\eclipse-workspace3\\2021-03-29\\src\\chapter8\\Ex4.java";
		// 복사 파일
		String copyPath = "D:\\eclipse-workspace3\\2021-03-29\\src\\chapter8\\Ex4.bak";
		
		try {
			fis = new FileInputStream(srcPath);
			fos = new FileOutputStream(copyPath);
		
			while (true) {
				int data = fis.read();
				if (data == -1) {
					break;
				}
				
				fos.write(data);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾지 못했습니다");
		} catch(IOException e) {
			System.out.println("문제가 발생하였습니다");
		}finally {
			try {
				fis.close();
			} catch (IOException e) {				
				e.printStackTrace();
			}
			// 같이 예외를 처리하지 말고 각각의 트라이 캐치로 예외처리를 해주어야 한다.
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
				
			}
		}
 		
	}

}
