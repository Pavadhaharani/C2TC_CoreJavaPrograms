package com.tnsif.basics;

public class OperatorsDemo {

	public static void main(String[] args) {
		int a = 10;
        int b = 10;
        int x = 20;
        int c = 10;

        System.out.println("a and b value before the operations : " + a + " " + b);

        ++a;     // pre-increment
        b++;     // post-increment
        System.out.println("a and b value after the operations : " + a + " " + b);

        int d = a++ + b + --c;
        System.out.println("c value after the operations : " + c);
        System.out.println("d value after the operations : " + d);

        System.out.println("a, b, c, d values after the operations : "
                + a + " " + b + " " + c + " " + d);

        // ternary operator demonstration
        x = (x == 20) ? 30 : 40;
        System.out.println(x);
	}

}
