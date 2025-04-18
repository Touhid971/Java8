package javabasics;
//Static members will get memory at class loading time 
//Static members are related to class not an object
//we can access/call static members (variable, method)with class name; example Dog.name; Dog.eat();
//Static members get memory only once in their life hence memory utilization is better than instance member.
//Purpose of static variable (we should choose static variable) If object to object property info not changing.
//Purpose of static method (for utility) 
//Purpose of static block)
//1. to initialize static member
//2. to load something at class loading time

public class StaticMembersExample {
	static int a=m1();
	static int b=10;
	
	static {
		System.out.println(a);
		System.out.println(b);
	}
	static int m1() {
	System.out.println(a);
	return 20;
	}
	public static void main(String[] args) {
		System.out.println("******");
		System.out.println(StaticMembersExample.a);
		System.out.println(StaticMembersExample.b);
		System.out.println(StaticMembersExample.m1());
		System.out.println("aAnother way of calling applicable with in a same class only");
		System.out.println(a);
		System.out.println(b);
		System.out.println(m1());
		
		
	}

	
}
