package com.metlife.shoppingcard;

public class Item {
    private int id;
    private String description;
    private int quantity;
    private double price;

    public Item()
    {
        quantity=1;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void printDiscountedPrice()
    {
        double final_price=0;
        if(quantity==2)
        {
            final_price=(price-(price*10/100))*quantity;
        }
        else if (quantity>=3 && quantity<=5) {
            final_price=(price-(price*15/100))*quantity;
        }
        else if(quantity>5)
        {
            final_price=(price-(price*25/100))*quantity;
        }
        System.out.println("The final price of "+description +" for "+quantity+" qty are "+final_price);
    }

    public static void printDescription(Item i)
    {
        System.out.println(i.description);
    }
    public void printDescription2()
    {
        System.out.println(description);
    }
    public static Item getItemInstance()
    {
        Item i=new Item();
        return i;
    }
}
