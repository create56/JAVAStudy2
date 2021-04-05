package chapter8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex6 {
	public static void main(String[] args) {
	FileOutputStream fis = null;
	try {
		fis = new FileOutputStream("C:\\Users\\ITPS\\Desktop\\output.txt");
		while(true) {
			int data = fis.read();
			if (data == -1) {
				break;
			}
			System.out.println((char) data);
		}	
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}finally {
		try {
			fis.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
	

	}

}
