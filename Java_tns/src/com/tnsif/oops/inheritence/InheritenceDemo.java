package com.tnsif.oops.inheritence;

class A{ //super/parent
	void display() {
		System.out.println("Hello World");
	}
	
}
class B extends A{ //child/ subclass
	
	
}
class C extends A{
	
}
public class InheritenceDemo {
	public static void main(String[] args) {
		C obj = new C();
		obj.display();
	}

}
