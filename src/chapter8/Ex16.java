package chapter8;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Ex16 {
	public static Map<String, Integer> pintFileList(File dir) {
		// listFile -> 이 객첵(dir)이 갖고 있는 디렉토리와 파일의 목록
		File[] files = dir.listFiles();
		
		// 이 객체 내 디렉토리 수
		int dirNum = 0;
		// 이 객체 내 파일의 수
		int fileNum = 0;
		
		for (int i = 0; i < files.length; i++) {
			File file = files[i];
			String fileName = files[i].getName();
			
			if (file.isDirectory()) {
				fileName = "[" + fileName + "]";
				dirNum++;
			} else {
				fileNum++;
			}
			System.out.println(fileName);
			
		}
		Map<String, Integer> count = new HashMap<>();
		count.put("fileNum", fileNum);
		count.put("dirNum", dirNum);
		
		return count;
	}
	public static void main(String[] args) {
		File dir = new File("src\\chapter8");
		if (!dir.exists() || !dir.isDirectory()) {
			System.out.println("유호하지 않은 디렉토리입니다");
			// exit -> 프로그램 종료 /강제종료의 느낌은 아님... 정상종료
			System.exit(0);
			
		}
		System.out.println(dir.getAbsolutePath() + "디렉토리");
		Map<String, Integer> count = pintFileList(dir);
		
		System.out.println("총 :" +count.get("fileNum") + "개의 파일");
		System.out.println("총 :" +count.get("dirNum") + "개의 디렉토리");
	}

}
