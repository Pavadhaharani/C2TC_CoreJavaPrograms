package com.tnsif.interfacedemo;

interface college{
	void show();
	}
class InterfaceDemo implements college {
	
    public void show() {
        System.out.println("Meenakshi College Of Engineering");
    }

    public static void main(String[] args) {
        InterfaceDemo obj = new InterfaceDemo();
        obj.show();
    }
}

	


