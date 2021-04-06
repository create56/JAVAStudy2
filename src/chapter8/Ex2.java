package chapter8;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Ex2 {
	public static void main(String[] args) {
		//inputStream�� ����� �迭
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		//outputStream�� ������ �����͸� ���� �迭
		byte[] outSrc = null;
		
		//���� �ִ� �����͸� 3���� �о���ڴ�!!!
		byte[] temp = new byte[3];
		
		// ����Ʈ ����� input ��Ʈ�� ����
		ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
		// ����Ʈ ����� output ��Ʈ�� ����
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		System.out.println(Arrays.toString(inSrc));
		try {
			while (input.available() > 0) {
				// read �� IOException�� �߻��ϴ� ����??
				// len -> ///////////////////////////////////read�޼��尡 ��ȯ�ϴ� �о�� �������� ����
				int len = input.read(temp);
				
				// temp�迭�� 0�� �ε������� �о�� �������� ������ŭ ��½�Ʈ������ ��������.
				output.write(temp, 0,len);
			
				outSrc = output.toByteArray();
				
				System.out.println("temp :" + Arrays.toString(temp));
				System.out.println("output source :" + Arrays.toString(outSrc));
			}
			input.read(temp);
			
			output.write(temp);
			
			outSrc = output.toByteArray();
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
//		while (true) {
//			int data = input.read();
//			if (data == 1) {
//				// ��Ʈ���� ����� �������� ���� �����ٸ�
//				// �� �ݺ����� ����������
//				break;
//			}
//			
//			output.write(data);
//		}
		
		System.out.println(Arrays.toString(outSrc));
		try {
			output.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			input .close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
