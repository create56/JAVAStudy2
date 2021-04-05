package chapter8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex3 {
	public static void main(String[] args) {
		// ���ڸ� ���ڿ��� �������ָ� ���ڷ� ���޹��� ��ο� �ִ� ���ϰ� ��Ʈ���� ����
		// ���� ��� : �ֻ��� ��θ� ������ ������ ��ġ / �ֻ��� ��κ��� �ش� ��ġ���� ������ ã��
		// ��� ��� : �һ��� ��θ� ������ ������ ��ġ / ���� ���α׷��� ����Ǵ� ��ġ���� �ش� ��ġ���� ������ ã��
		
		// ������ �ڷḦ ���� ����ó�� �ڼ��� ���� // �Ϲ������� catch���� �ϳ��� ���̰ų� IOException�� ���
		FileInputStream fis = null;
		try {
			String path = D:\\eclipse-workspace3\\2021-03-29\\src\\chapter8\\Ex3.java;
			fis = new FileInputStream(path);
			while (true) {
				int data = fis.read();
				if (data == -1) {
					break;
				}
				
				char c = (char) data;
				System.out.println(c);
			}
			//��Ʈ���� �ݴ°� �߿��ϴ�.
		} catch (FileNotFoundException e) {
			System.out.println("������ ã�� ���߽��ϴ�");
		} catch(IOException e) {
			System.out.println("��Ʈ���� �ݴ� ���� ������ �߻��Ͽ����ϴ�");
		} finally {
			try {
				fis.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		
		System.out.println("���α׷� ��");
			
		
	}

}
