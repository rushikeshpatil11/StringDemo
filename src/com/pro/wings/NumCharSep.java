package com.pro.wings;

import java.util.Scanner;

public class NumCharSep {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String");
//		String s="123RAM45";
		String s=sc.nextLine();
		char []c=s.toCharArray();
		char []num=new char[c.length];
		char []ch=new char[c.length];
		int j=0;
		int k=0;
		int count=0;
		
		for(int i=0;i<c.length;i++) {
			
			if(Character.isDigit(c[i]))
			{
				num[j]=c[i];
				j++;
			}
			else {
				ch[k]=c[i];
				k++;
				if(k==1)
					count=i;
			}
		}
		String s1=new String(num);
		String s2=new String(ch);
		StringBuffer sb=new StringBuffer(s1.trim());
		StringBuffer sb1=new StringBuffer(s2.trim());
		sb1.reverse();
		sb.insert(count, sb1);
		System.out.println(sb);
		
		
	}

}
