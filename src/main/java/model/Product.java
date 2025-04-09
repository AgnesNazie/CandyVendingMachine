package model;


public abstract class Product {
    private static int idCounter = 0;
    private final int id;
    private final double price;
    private String productName;

    //constructor

    public Product( double price, String productName) {

        this.id = idCounter++;
        this.price = price;
        this.productName = productName;
    }
    //getter for id

    public int getId() {
        return id;

    }
    //getter for price

    public double getPrice() {
        return price;
    }

    //getter for productName

    public String getProductName() {
        return productName;
    }
    //setter for productName

    public void setProductName(String productName) {
        if (productName == null || productName.trim().isEmpty())
            throw new IllegalArgumentException("product Name cannot be null or empty");
        this.productName = productName;
    }

    public abstract String examine();

    public abstract String use();
}
