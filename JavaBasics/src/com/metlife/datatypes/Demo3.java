package com.metlife.datatypes;

public class Demo3 {
    public static void main(String[] args) {

        int radius=10;
        //area of circle
        //3.14
        double result=3.14*radius*radius;
        System.out.println("The output is "+result);

        int height=25;
        int base=1;
        //calculate and print area of triangle
        double output= ( base*height)/(double) 2;
        System.out.println(output);

        double z=1.1;
        float x= (float) z; //explicit conversion - leads to data loss
        System.out.println(x);

    }
}
