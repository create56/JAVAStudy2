package chapter8;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ex18 {
	public static final char sortOptionList[] = {'t','T','l','L','n','N'};
	
	public static boolean isOrtOption(char sortOption) {
		for (char option : sortOptionList) {
			if (option == sortOption) {
				return true;
			}
		}
		return false;
	}
	
	public static void sortFileList(File[] files,char option) {
		if (option == 't') {
			// 시간 오름차순 정렬
			for (int i = 0; i < files.length; i++) {
				for (int j=files.length-1; j>i; j--) {
					File forward = files[j-i];
					File backward = files[j];
					
					long forwardLastModified = forward.lastModified();
					long backwardLastModified = backward.lastModified();
					
					if (forwardLastModified > backwardLastModified) {
						File temp = files[j-i];
						files[j-i] = files[j];
						files[j] = temp;
					}
				}
			}
		}
		
	}
	public static void main(String[] args) {
	Scanner scanf = new Scanner(System.in);
	
	System.out.println("===== [사용법] =====");
	System.out.println("경로 : (디렉토리 또는 파일의 경로 입력");
	System.out.println("(정렬 단어)");
	System.out.println("└ t : 시간 오름차순 정렬 " );
	System.out.println("└ T : 시간 내름차순 정렬 " );
	System.out.println("└ l : 크기 오름차순 정렬 " );
	System.out.println("└ L : 크기 내름차순 정렬 " );
	System.out.println("└ n : 이름 오름차순 정렬 " );
	System.out.println("└ N : 이름 내림차순 정렬 " );
	
	while (true) {
		System.out.println("경로 :");
		String path =scanf.next();
		
		System.out.println("정렬 :");
		char sort = scanf.next().charAt(0);
		
		if (path.equals("exit")) {
			System.out.println("프로그램을 종료합니다");
			break;
		}
		
		File file = new File(path);
		File[] files = file.listFiles();
		System.out.println("정렬 전");
		for (File f : files) {
			String name = f.getName();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm a");
			String lastModified = sdf.format(new Date(f.lastModified()));
			String attribute ="DIR";
			long size = f.length();
			
			
			if (f.isFile()) {
				attribute = f.canRead() ? "R" : " ";
				attribute += f.canWrite() ? "W" : " ";
				attribute += f.isHidden() ? "H" : " ";
			}
			System.out.printf("%s %3s %6s %s\n", lastModified,attribute,size,name);
		}
		sortFileList(files,sort);
		System.out.println("정렬 후");
		for (File f : files) {
			String name = f.getName();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm a");
			String lastModified = sdf.format(new Date(f.lastModified()));
			String attribute ="DIR";
			long size = f.length();
			
			
			if (f.isFile()) {
				attribute = f.canRead() ? "R" : " ";
				attribute += f.canWrite() ? "W" : " ";
				attribute += f.isHidden() ? "H" : " ";
			}
			System.out.printf("%s %3s %6s %s\n", lastModified,attribute,size,name);
		}
	}

	}

}
