package com.tnsif.Activity1;

class C2 {
    void show(int a) {
        System.out.println("Value in C2: " + a);
    }
}

class D2 extends C2 {
    void show(int a) {
        System.out.println("Value in D2: " + a);
    }
}

public class Test_8 {
    public static void main(String[] args) {

        C2 obj = new D2();
        obj.show(10);
    }
}




