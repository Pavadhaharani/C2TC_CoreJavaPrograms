package com.tnsif.Activity1;
class A3 {

    void display() {
        System.out.println("A display");
    }
}

class B3 extends A3 {

    void display() {
        System.out.println("B display");
    }

    public static void main(String[] args) {

        A3 obj = new B3();
        obj.display();
    }
}




