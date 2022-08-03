package edu;

public class Page_198_Armor {

	// Armor에 대한 field, method정의한다.
	private String name;
	private int height;
	private int weight;
	private String color;
	private boolean isFly;
	
	public String setName(String nombre) {
		String value = nombre;
		return value;
	}
	
	public static void main(String[] args) {
		Page_198_Armor rubin = new Page_198_Armor();
		rubin.name = rubin.setName("RUBIN");
		
		Page_198_Armor jiyoung = new Page_198_Armor();
		jiyoung.name = jiyoung.setName("JIYOUNG");
		
		System.out.println(rubin.name);
		System.out.println(jiyoung.name);
	}

}
