package chapter4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Passenger {
	public static void main(String[] args) {
		
		List<Passenger>passengerLisst = new ArrayList<>();
		Passenger passenger1 = new Passenger("ȫ�浿", "010-1473-3968","���ڳ��");
		Passenger passenger2 = new Passenger("ȫ�浿", "010-1473-3968","���ڳ��");
		Passenger passenger3 = new Passenger("ȫ�浿", "010-1473-3968","���ڳ��");
		
		
		
		passengerList.add(passenger1);
		int [] arr = {1,2,3,4,5};
		
	Inerator<passenger> it = passengerList.iterator();
	while(it.hasNext) {
		passenger p1 = it.next();
		System.out.println(p1.get);
	}
	
	// ����ֳ���? -> true /�׷��� ������ false
	
	// �÷��� �����ӿ�ũ�� ����ִ¿�� ������ ��ȯ
	// i�� 0���� �����ؼ� X�� ������
	// ���� for�� / foreach��
	
	
	}

	@Override
	public int hashCode() {
		// String Ŭ������ �����Ǿ��ִ� HashCode �� ���������� Ȱ���ϸ� 
		// ���� �����ϰ� �츮���� �ʿ��� �ؽ��Լ��� ���� �� �ִ�
		
		// String Ŭ������ hashcode �޼���
		// ���ڿ��� �ؽ�ȭ��
		int hasCode = name.hashCode() + tel.hashCode() + seat.hashCode();
		
		if (name.equal("ȫ�浿")) {
			hashCode += 1;
		}
		if (te1.equals("010-7591-8524")) {
			hashCode += 2;
			
		}
		if (seat.equals("���ڳ��")) {
			hashCode += 3;
		}
		
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Passenger) {
		
			// �Ű������� ���޹��� ��ü�� passenger Ŭ���� Ÿ������ ��ȯ�� �� �ִٸ�
			Passenger target = (Passenger) obj;
			
			return this.hashCode() == obj.hashCode();
 		} else {
			// �Ű������� ���޹��� ��ü�� Passenger Ŭ���� Ÿ������ ��ȯ�� �� ���ٸ�
			// false
			return false;
		}
		
	}
	
	
}
	