package edu;

public class Page_209 {

	static void test(String name, int... v) {
		System.out.print(name + " : ");
		for(int x : v)
			System.out.print(x + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		test("±èÇÑ¿ë", 98, 85, 88);
		test("ÃµÁö¿µ", 87, 97, 88, 15, 36);
		test("±è±â¿ø", 93, 84, 78, 12);
	}
}
