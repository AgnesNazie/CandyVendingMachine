package model;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineImpl implements VendingMachine{
    private List<Product> products;
    private int depositPool;

    //constructor
    public VendingMachineImpl(List<Product> products) {
        this.products = products;
        this.depositPool = 0;
    }
    //adds currency method

    @Override
    public void addCurrency(int amount) {
        depositPool += amount;
        System.out.println("Added " + amount + " to balance.  Current balance: " + depositPool);

    }
    //creates the current deposit method

    @Override
    public int getBalance() {
        return depositPool;
    }
    //gives the product requested (nested for loop because i am dealing with an array)

    @Override
    public Product request(int id) {
        for (Product product : products)  {
            if (product.getId() == id) {
                if (depositPool >= product.getPrice()) {
                    depositPool -= product.getPrice();
                    System.out.println("Dispensing: " + product.getProductName());
                    return product;
                } else {
                    System.out.println("Insufficient  amounts for: " + product.getProductName());
                    return null;
                }
            }
        }
        System.out.println("Product not found.");
        return null;
    }
    //end session implements

    @Override
    public int endSession() {
        int refund = depositPool;
        depositPool = 0;
        System.out.println("Session ends. Refunded amount: " + refund);
        return refund;
    }
    //description implements

    @Override
    public String getDescription(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product.toString();
            }
        }
        return "Product not found";
    }
    //implements that display list of all products

    @Override
    public List<String> getProducts() {
        List<String> productList = new ArrayList<>();
        for (Product product : products) {
            productList.add("[" + product.getId() + "]" + product.getProductName() + "cost $" + product.getPrice());
        }
        return productList;
    }
}
