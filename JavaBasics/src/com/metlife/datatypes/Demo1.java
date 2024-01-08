package com.metlife.datatypes;

public class Demo1 {

    public void test()
    {
        System.out.println();
    }

    public static void main(String[] args) {

        byte a=100; //a is registered for short. 8 bits of memory
        short b=100; //16 bits of memory
        int c=100; //32 bits of memory
        long d=8898989888L; //64 bits of memory

        //0 to 100
        //1000 students (byte) --> 8 * 1000 = 8000 bits of memory
        //1000 students (int) --> 32 * 1000 = 32000 bits of memory

        float e=1.123456789f; //32 bits
        double f=1.123456789; //64 bits

        char letter='b'; //16 bits of memory
        boolean check=true;

        String myName="Balaji"; //4*16 bits of memory

        System.out.println(myName);
        System.out.println(myName.length());
        System.out.println(myName.toUpperCase());
        System.out.println(myName.charAt(5));

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        System.out.println(e);
        System.out.println(f);
    }
}
