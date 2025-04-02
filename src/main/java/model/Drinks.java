package model;

public class Drinks extends  Product {
    private  boolean sugarFree;

    //constructor
    public Drinks(double price, String productName, boolean sugarFree) {
        super(price, productName);
        this.sugarFree = sugarFree;
    }
    //getter for sugarFree

    public boolean isSugarFree() {
        return sugarFree;
    }

    @Override
    public String examine() {
        return "Drinks :" + getProductName() + "Cost: $" + getPrice() + (sugarFree ? "Sugar-Free" : "Contains Sugar") + ".";
    }

    @Override
    public String use() {
        return "You Enjoy the refreshing taste of " + getProductName() + ". Perfect for relaxation!";
    }
}
