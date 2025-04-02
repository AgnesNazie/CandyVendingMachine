package model;

import java.util.List;

public interface VendingMachine {
    // adds money to the deposit pool
    void addCurrency (int amount);

    //returns balance in the deposit pool
    int getBalance();

    //returns the products if balance is enough in the deposit pool
    Product request(int id);

    // ends the session after buying and returns balance
    int endSession ();

    //gives the description of the product based on id
    String getDescription(int id);

    //gives list of all products
    List<String> getProducts();

}
