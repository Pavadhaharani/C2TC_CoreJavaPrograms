package com.tnsif.Activity1;

class E2 {

     int x = 5;

    void print() {
        System.out.println(x);
    }
}

class F2 extends E2 {

    int x = 15;

    void print() {
        System.out.println(super.x);
    }
}

public class Test_11 {

    public static void main(String[] args) {

        E2 obj = new F2();
        obj.print();
    }
}
