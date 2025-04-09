package model;

public class ChocolateBar extends Product {
    private final String chocolateType;

    public ChocolateBar(double price, String productName, String chocolateType) {
        super(price, productName);
        this.chocolateType = chocolateType;
    }
    //getters for chocolateType

    public String  getChocolateType() {
        return chocolateType;
    }

    @Override
    public String examine() {
        return "Chocolate Bar: " + super.getProductName() + "Cost $" + super.getPrice() + "Type: " + chocolateType + ".";
    }

    @Override
    public String use() {
        return "You enjoy the " + chocolateType.toLowerCase() + super.getProductName() + "Smooth and satisfying!";
    }
}
