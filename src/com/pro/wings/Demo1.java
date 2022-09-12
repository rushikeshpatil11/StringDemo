package com.pro.wings;

public class Demo1 {
	
	public static void main(String[] args) {
		
		String s=new String ("RAM");
		String s1=s.intern();
		String s2="RAM";
		
		System.out.println(s==s1);
		System.out.println(s1.intern()==s2);
		System.out.println(s1.toUpperCase()==s2);
		
		//add comment
		//add another comment
	}

}
