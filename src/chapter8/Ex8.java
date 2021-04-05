package chapter8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex8 {
	public static void main(String[] args) {
		// fis, fr - �Է� ��Ʈ��
		// fis - ����Ʈ ��� �Է� ��Ʈ��
		// fr - ���� ����Է� ��Ʈ��
		FileInputStream fis = null;
		FileReader fr = null;
		
		String fileName = "C:\\Users\\ITPS\\Desktop\\test.txt";
		try {
			fis = new FileInputStream(fileName);
			fr  = new FileReader(fileName);
			
			while (true) {
				int data = fis.read();
				if (data == -1) {
					break;
				}
				System.out.println((char)data);
			}
				System.out.println();
			while (true) {
				int data = fr.read();
				if (data == -1) {
					break;
				}
				System.out.println((char)data);
			}
			
			} catch (FileNotFoundException e) {
			e.printStackTrace();
			}catch (IOException e) {
			e.printStackTrace();
			} finally {
			try {
				fr.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			} 
			try {
				fis.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	}
				
}	

	


