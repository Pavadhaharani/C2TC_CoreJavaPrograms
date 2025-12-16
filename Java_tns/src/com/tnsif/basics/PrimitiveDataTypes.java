package com.tnsif.basics;

public class PrimitiveDataTypes {
	public static void main(String[] args) {

        // byte - 1 byte
        byte byteMin = -128;
        byte byteMax = 127;
        System.out.println("Min range of byte is " + byteMin);
        System.out.println("Max range of byte is " + byteMax);

        // short - 2 bytes
        short shortMin = -32768;
        short shortMax = 32767;
        System.out.println("Min range of short is " + shortMin);
        System.out.println("Max range of short is " + shortMax);

        // int - 4 bytes
        int intMin = -2147483648;
        int intMax = 2147483647;
        System.out.println("Min range of int is " + intMin);
        System.out.println("Max range of int is " + intMax);

        // long - 8 bytes
        long longMin = -9223372036854775808L;
        long longMax = 9223372036854775807L;
        System.out.println("Min range of long is " + longMin);
        System.out.println("Max range of long is " + longMax);

        // float & double
        float f = 234.14124327845f;
        double d = 3456.141245123456789012345678914f;
        System.out.println("float value is " + f);
        System.out.println("double value is " + d);

        // boolean
        boolean flag = false;
        System.out.println("boolean value is " + flag);
    }

}
