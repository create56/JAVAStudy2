package chapter4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PracTics {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		while (true) {
			System.out.print("노래 가사를 입력하세요.(종료 : -1) :");			
			String lyrics = scanf.next();
			if (lyrics.equals("-1")) {
				break;
			}
			
			boolean 
			if (lyricsSet.add(lyrics)) {
				
			} else {
				System.out.println("이미 입력된 가사입니다 =>" +lyrics);
			}
			
			System.out.println();
		}
		scanf.close();
		
	}

}
