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
			fw = new FileWriter("Ex11.bak");
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			
			String line = "";
			for (int i = 1; line != null; i++) {
				line =br.readLine();
				
				bw.write(i + " : " + line );
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {		
		} catch (IOException e) {
			e.printStackTrace();
			
		
			}
			
		}
		
	}

}
