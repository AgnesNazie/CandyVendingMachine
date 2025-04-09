package model;

public class Drinks extends  Product {
    private final boolean sugarFree;

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
        return "Drinks :" + super.getProductName() + "Cost: $" + super.getPrice() + (sugarFree ? "Sugar-Free" : "Contains Sugar") + ".";
    }

    @Override
    public String use() {
        return "You Enjoy the refreshing taste of " + super.getProductName() + ". Perfect for relaxation!";
    }
}
