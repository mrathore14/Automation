package com.metlife.datatypes;

public class Demo2 {

    public static void main(String[] args) {

        //10,20,30,40,50
        int[] numbers=new int[5]; //5*32 bits

        numbers[0]=10;
        numbers[1]=20;
        numbers[2]=30;
        numbers[3]=40;
//        numbers[4]=50;

        System.out.println(numbers);
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[4]);

        double[] arr1=new double[2];
        arr1[0]=10;
//        arr1[1]=102.3;

        System.out.println(arr1[1]);

        //red,green,yellow
        String[] colors=new String[3];
        colors[0]="red";
        colors[1]="yellow";
        colors[2]="green";

        System.out.println(colors);
        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);

//        char[] arr3=new char[2];
//        arr3[0]='$';
//        arr3[1]='r';

//        System.out.println(arr3);

    }
}
