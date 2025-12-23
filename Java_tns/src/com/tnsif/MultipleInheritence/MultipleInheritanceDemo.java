package com.tnsif.MultipleInheritence;
//two interface method

interface one{
	void show();
}

interface two{
	void draw();
	
}
	//implement the interface in another class
class Example implements one, two{
@Override
	public void show() {
		System.out.println("Show the answer of the input");
	}
	
@Override
	public void draw() {
		System.out.println("draw the shapes");
	}
}
public class MultipleInheritanceDemo {
	
 public static void main (String[]args) {
	 Example obj = new Example();
     obj.show();
     obj.draw();
	 
 }
}