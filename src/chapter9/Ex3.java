package chapter9;

import java.net.URL;
import java.net.URLConnection;

public class Ex3 {
	public static void main(String[] args) {
		URL url = null;
		String IPAddress = "http://www.youtude.com";
		
		try {
			url = new URL(IPAddress);
			URLConnection conn = url.openConnection();
			// 연결 정보 출력
			System.out.println("conn = " + conn);
			System.out.println(conn.getConnectTimeout());
			// 연결 종료까지 남은시간
			System.out.println(conn.getAllowUserInteraction());
			// 연결된 자원에 대한 정보를 갖고 있는 content 객체
			System.out.println(conn.getContent());
			// 연결된 자원의 표현 방식
			System.out.println(conn.getContentEncoding());
			// 연결된 자원의 크기
			System.out.println(conn.getContentLength());
			// 연결된 자원의 크기(MineType)
			System.out.println(conn.getContentType());
			System.out.println(conn.getDate());
			System.out.println(conn.getDoInput());
			System.out.println(conn.getDoOutput());
			// 연결된 자원의 만료기간
			System.out.println(conn.getExpiration()); 
			System.out.println(conn.getIfModifiedSince());
			// 연결된 자원의 마지막 수정날짜
			System.out.println(conn.getLastModified());
			System.out.println(conn.getReadTimeout());
			System.out.println(conn.getURL());
			System.out.println(conn.getUseCaches());
					
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}
