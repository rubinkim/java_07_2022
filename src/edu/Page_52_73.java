package edu;

public class Page_52_73 {

	public static void main(String[] args) {
		// ����Ÿ�԰� ���� (8���� �⺻Ÿ�԰� ������ �ּҸ� �����ϴ� ����Ÿ��)
		System.out.println("Hello, all of you guys!!");
		
		// ����,��,����,�Ǽ�,����Ÿ���� ������ �����ϰ� �ʱ�ȭ�Ѵ�.
		byte age = 23;                  // 1byte  ����Ÿ��
		short point = 32000;            // 2bytes ����Ÿ��
		int price = 3500000;            // 4bytes ����Ÿ��
		long totalSales = 2147483648L;  // 8bytes ����Ÿ�� 
		
		boolean isMarried = true;       // 1bytes
		char gender = 'F';              // 2bytes, �ѱ����� ��
		float PI = 3.14F;               // 4bytes �Ǽ�Ÿ��
		double USDAmount = 600.50;      // 8bytes �Ǽ�Ÿ��
		String name = "Amy"; // ����Ÿ��(�޸��� ��ġ�� �����ϴ� Ÿ��)
		
		
		System.out.println(age); System.out.println(point);
		System.out.println(price); System.out.println(totalSales);
		System.out.println(isMarried); System.out.println(gender);
		System.out.println(PI); System.out.println(USDAmount);
		System.out.println(name);
		 
	}
}
