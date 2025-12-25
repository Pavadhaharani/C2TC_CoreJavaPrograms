package com.tnsif.Activity1;

class Test_3 {

    int x;
    int y;

    Test_3(int x) {
        this.x = x;
    }

    void display() {
        System.out.println(x);
    }

    public static void main(String[] args) {
        Test_3 obj = new Test_3(10);
        obj.display();
    }
}


