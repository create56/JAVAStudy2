package chapter4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex11 {
	public static void main(String[] args) {
		Map<String, String> hashMap = new HashMap<>();
		
		hashMap.put("ȫ�浿", "���ڳ��");
		hashMap.put("��ö��", "�۽�Ʈ");
		hashMap.put("����", "����Ͻ�");
		hashMap.put("������ȣ", "�۽�Ʈ");
		hashMap.put("Ȳ����", "���ڳ��");
		
		//������ �߰�
		hashMap.put("������ȣ", "���ڳ��");
		
		System.out.println(hashMap);
		
		// ������ ����
		hashMap.remove("Ȳ����");
		
		System.out.println(hashMap);
		
		// keySet�̿� ���
		Set<String> keySet = hashMap.keySet();
		Iterator<String> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			
			System.out.println(key +" =" +hashMap.get(key));
		}

	}

}
