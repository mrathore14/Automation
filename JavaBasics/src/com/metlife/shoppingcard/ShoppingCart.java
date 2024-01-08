package com.metlife.shoppingcard;
//created on dec 21
public class ShoppingCart {
    public static void main(String[] args) {

        Item item1=new Item();
        Item item2=new Item();

        item1.setDescription("Laptop");
        item1.setPrice(1000);
        item1.setQuantity(2);

        item2.setDescription("Mobile");
        item2.setPrice(1000);
        item2.setQuantity(5);

        System.out.println(item1);
        System.out.println(item2);

        item1.printDiscountedPrice();
        item2.printDiscountedPrice();

        //pass by reference
        Item.printDescription(item2);
        item2.printDescription2();

        Item item3= Item.getItemInstance();
        item3.printDescription2();

//        Item[] items=new Item[2];
//        items[0]=item1;


//        item1=item2;
//        //item1,item2 are pointing to second object
//        System.out.println(item1);
//        System.out.println(item2);
//
//        item1.setDescription("Watch");
//
//        System.out.println(item1.getDescription());
//        System.out.println(item2.getDescription());




    }
}
