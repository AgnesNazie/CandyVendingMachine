package model;

import java.util.List;

public interface VendingMachine {
    void addCurrency (int amount);
    int getBalance();
    Product request(int id);
    int endSession ();
    String getDescription(int id);
    List<String> getProducts();

}
