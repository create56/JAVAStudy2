package chapter8;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException; class Ex11 {
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fr = new FileReader("Ex11.java");
			br = new BufferedReader(fr);
			fw = new FileWriter("Ex11.bak");
			bw = new BufferedWriter(fw);
			
			String line = "";
			for (int i = 1; line != null; i++) {
				// line -> 입력 스트림에서 읽어온 한 줄의 문자열이 있음
				line =br.readLine();
				
				// line 변수 내 import 문자열 포함되어있는지 체크
				// indexof 매서드 -> 매개변수로 전달한 문자열이 해당 객체 내 어는 위치에 존재하는지 알려주는 매서드
				// 매개변수로 전달한 문자열이 존재한다. -> 0이상의 값을 반환 / 매개변수로 전달한 무자열의 인덱스 번호
				// 매개변수로 전달한 문자열이 존재하지 않는다 -> -1을 반환
				if (line != null && line.indexOf("import") != -1) {// 이 문자열을 나타내지 않을려면 (import) == 0
					bw.write(i + ":" + line);
					bw.newLine();
				}
				bw.write(i + " : " + line);
				bw.newLine();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
		} catch (IOException e) {
			e.printStackTrace();
			
		
			}
			
		}
		
	}

}
