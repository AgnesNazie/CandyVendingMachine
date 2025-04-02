package model;

public class Gummy extends Product {
    private String flavour;
     //constructor

    public Gummy(double price, String productName, String flavour) {
        super(price, productName);
        this.flavour = flavour;
    }
    //getter for flavour

    public String getFlavour() {
        return flavour;
    }

    @Override
    public String examine() {
        return "Gummy:" + getProductName() + "Cost $ " + getPrice() + "Flavour" +  flavour + ".";
    }

    @Override
    public String use() {
        return "You pop a " + flavour.toLowerCase() + "Flavoured gummy into your mouth. Chewy and sweet!";
    }
}
