package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VendingMachineImpl implements VendingMachine {
    private final List<Product> products;
    private int depositPool;

    //Allowed money (1, 2, 5, 10, etc)
    private final List<Integer> validAmounts = Arrays.asList(1, 2, 5, 10, 20, 50, 100, 200, 500, 1000);

    //constructor
    public VendingMachineImpl(List<Product> products) {
        this.products = (products != null) ? products : new ArrayList<>();
        this.depositPool = 0;
    }
    //adds currency add currency

    @Override
    public void addCurrency(int amount) {
        if (validAmounts.contains(amount)) {
            depositPool += amount;
            System.out.println("✅ Money added! Current balance: $" + depositPool);
        } else {
            System.out.println("Invalid currency: $" + amount + " .Please use the valid Amount: " + validAmounts);
        }

    }

    //creates the current deposit balance
    @Override
    public int getBalance() {
        return depositPool;
    }
    //gives the product requested (nested for loop because i am dealing with an array)

    @Override
    public Product request(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                if (depositPool >= product.getPrice()) {
                    depositPool -= (int) product.getPrice();
                    System.out.println("Dispensing: " + product.getProductName());
                    return product;
                } else {
                    throw new IllegalArgumentException("Insufficient amounts. Price: $" + product.getPrice() + "Your balance : $" + depositPool);
                }
            }
        }
        throw new IllegalArgumentException("Product ID" + id + "not found.");
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
                return "Product:" + product.getProductName() + "| Price: $" + product.getPrice();
            }
        }
        throw new IllegalArgumentException("Product ID " + id + "not found.");
    }
    //methods display list of all products

    @Override
    public List<String> getProducts() {
        List<String> productList = new ArrayList<>();
        for (Product product : products) {
            productList.add("[" + product.getId() + "] " + product.getProductName() + " | Cost: $" + product.getPrice());
        }
        return productList;
    }
}
