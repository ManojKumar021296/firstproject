package org.string;

public class Compare {
	public static void main(String[] args) {
		
		String str = "Nisha";
		String str1 = "nisha";
		String str2 = "Nia";
		String str3 = "nisha";
		
		
		int compare = str.compareTo(str1);
		System.out.println(compare);
		
		int compare1 = str2.compareTo(str3);
		System.out.println(compare1);
		
	}

}
