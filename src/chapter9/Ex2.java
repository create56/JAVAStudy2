package chapter9;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class Ex2 {
	public static void main(String[] args) {
		
		try {
			String protocol = "http://";
			String host = "www.ddaily.co.kr/";
			String path = "data/photos/cdn/20210104/";
			String resource = "art_ 1611539583.jpg";
			String queryString = "?referer=naver";
			String anchor = "#index";
			URL ur1 = new URL(protocol + host + path + resource + queryString + anchor);
			
			System.out.println("ur1.getAuthority()=" + ur1.getAuthority());
			System.out.println("ur1.getContent()="+ur1.getContent());
			System.out.println("ur1.getDefaultPort()="+ur1.getDefaultPort());
			System.out.println(""+ur1.getPort());
			System.out.println(""+ur1.getFile());
			System.out.println(""+ur1.getPath());
			System.out.println(""+ur1.getProtocol());
			System.out.println(""+ur1.getQuery());
			System.out.println(""+ur1.getRef());
			System.out.println(""+ur1.getUserInfo());
			System.out.println(""+ur1.toExternalForm());
			System.out.println(""+ur1.toURI());
		} catch (IOException | URISyntaxException e) {
			e.printStackTrace();
			
		}
		

	}

}
