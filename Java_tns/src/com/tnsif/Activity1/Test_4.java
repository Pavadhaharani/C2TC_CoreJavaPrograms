package com.tnsif.Activity1;

class A2 {
    int x = 10;
}

class B2 extends A2 {
    int x = 20;

    public String toString() {
        return "x" + x;
    }

    public static void main(String[] args) {
        B2 b = new B2();
        System.out.println(b.toString());
    }
}

