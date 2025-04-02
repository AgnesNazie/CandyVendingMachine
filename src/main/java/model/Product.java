package model;

import static java.util.UUID.randomUUID;

public abstract class Product {
    private int id;
    private double price;
    private String productName;

    //constructor

    public Product(double price, String productName) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        if (productName == null || productName.trim().isEmpty()) {
            throw new IllegalArgumentException("Products name cannot be null or empty");
        }
        this.id = randomUUID().hashCode();
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
    //setter for price

    public void setPrice(double price) {
        if (price < 0)
            throw new IllegalArgumentException("price cannot be negative");
        this.price = price;
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
