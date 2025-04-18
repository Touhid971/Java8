package javabasics;
//instance member get memory when you create an object
//Access/call instance member with the help of object reference
//Purpose of instance variable (when we should use instance variable)
//If value changes object to object
//Purpose of instance block
//To initialize the instance variable other than constructor
//Purpose of constructor
//1.To initialize the variables
//2. To create an object (to help in object creation)

public class InstanceMemberExample {
	int a=m1();
	int b=10;
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	int m1() {
		 System.out.println(a);
		 return 0;
	}
public InstanceMemberExample() {
	System.out.println("Constructor");
}
public static void main(String[] args) {
	InstanceMemberExample InstanceMemberExample = new InstanceMemberExample();
	
}
}
