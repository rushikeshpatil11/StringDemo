package com.pro.wings;

public class Calling {
	public static void main(String[] args) {
		
		A a=new A();
		B b=new B();
	}
	
	

}

class A{
	int i;
	{
		System.out.println("1");
	}
	static {
		System.out.println("2");
	}
	public A() {
		System.out.println("3");
	}
	public A(int i) {
		this.i=i;
	}
}
class B extends A{
	{
		System.out.println("4");
	}
	static {
		System.out.println("5");
	}
	public B() {
		System.out.println("6");
	}
}


