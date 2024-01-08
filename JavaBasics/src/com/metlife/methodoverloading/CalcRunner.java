package com.metlife.methodoverloading;

public class CalcRunner {

    public static void main(String[] args) {

        Calculator cal=new Calculator();
        cal.add(10,10);

        double res=Math.sqrt(64);
        System.out.println(res);

        System.out.println(Math.PI);

        System.out.println(Math.max(10,12.2));
    }
}
