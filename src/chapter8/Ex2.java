package chapter8;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Ex2 {
	public static void main(String[] args) {
		//inputStream과 연결된 배열
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		//outputStream에 저정된 데이터를 갓는 배열
		byte[] outSrc = null;
		
		//위에 있는 데이터를 3개씩 읽어오겠다!!!
		byte[] temp = new byte[3];
		
		// 바이트 기반의 input 스트림 생성
		ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
		// 바이트 기반의 output 스트림 생성
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		System.out.println(Arrays.toString(inSrc));
		try {
			while (input.available() > 0) {
				// read 시 IOException가 발생하는 이유??
				// len -> read메서드가 반환하는 읽어온 데이터의 개수
				int len = input.read(temp);
				
				// temp배열의 0번 인덱스에서 읽어온 데이터의 개수만큼 출력스트림으로 내보낸다.
				output.write(temp, 0,len);
			
				outSrc = output.toByteArray();
				
				System.out.println("temp :" + Arrays.toString(temp));
				System.out.println("output source :" + Arrays.toString(outSrc));
			}
			input.read(temp);
			
			output.write(temp);
			
			outSrc = output.toByteArray();
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
//		while (true) {
//			int data = input.read();
//			if (data == 1) {
//				// 스트림과 연결된 데이터의 끝을 만났다면
//				// 이 반복문을 빠져나가라
//				break;
//			}
//			
//			output.write(data);
//		}
		
		System.out.println(Arrays.toString(outSrc));
		try {
			output.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			input .close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
