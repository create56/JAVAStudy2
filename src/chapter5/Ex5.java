package chapter5;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("������ ��� 1"); 
		System.out.println("������ ��� 2");
		System.out.println("���� �Է� :");
		
		int genderValue = scanf.nextInt();
		
		try {
			Gender gender =Gender.getaGender(genderValue);
			if (gender == Gender.MALE) {
				System.out.println("�����Դϴ�");
				System.out.println("������");
				System.out.println("����");
				System.out.println("�����ϴ�");
				System.out.println("��ǰ��");
				System.out.println("���ַ�");
				System.out.println("������");
				System.out.println("����");
			} else {
				System.out.println("�����Դϴ�");
				System.out.println("������");
				System.out.println("����");
				System.out.println("�����ϴ�");
				System.out.println("��ǰ��");
				System.out.println("���ַ�");
				System.out.println("������");
				System.out.println("����");
			} 
			
		} catch (IllegalArgumentException e) {
			System.out.println(genderValue + "��(��) �������� ���� �����Դϴ�");
		}
		
	}
}
