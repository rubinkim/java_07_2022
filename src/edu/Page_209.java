package edu;

public class Page_209 {

	static void test(String name, int... v) {
		System.out.print(name + " : ");
		for(int x : v)
			System.out.print(x + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		test("���ѿ�", 98, 85, 88);
		test("õ����", 87, 97, 88, 15, 36);
		test("����", 93, 84, 78, 12);
	}
}
