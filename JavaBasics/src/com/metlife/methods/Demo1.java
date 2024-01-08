package com.metlife.methods;

import com.metlife.formulae.Area;

public class Demo1 {

    public static void main(String[] args) {
        int radius=10;

        //allocating memory and loading all non-static var,method in Area class
        Area obj=new Area();

        double res= obj.areaOfCircle(10);
        System.out.println(res);

        double res1= Area.areaOfRectangle(10,10.2);
        System.out.println(res1);

        System.out.println(Area.areaOfRectangle(5,5));

        res1=Area.areaOfTriangle(25,1);
        System.out.println(res1);

        String myName= obj.getAuthorName();
         System.out.println(myName);

         Area.quit();
    }
}
