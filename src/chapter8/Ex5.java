package chapter8;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex5 {
	public static void main(String[] args) {
		FileOutputStream  fos = null;
		try {
			fos = new FileOutputStream("C:\\Users\\ITPS\\Desktop");
			
			for (byte i = 'A'; i <= 'Z'; i++) {
				fos.write(i);
				fos.write('\n');
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fos.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		
	}

}
