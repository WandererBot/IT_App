/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author formacio
 */
public class FlowerShop {

    protected String name;
    private static FlowerShop shop;
    private List<Item> stock = new ArrayList<>();

    public static FlowerShop getFlowerShop() throws Exception {
        if (shop == null) {
            return new FlowerShop();
        }
        return shop;

    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Item> getAllItems() {
        return new ArrayList<>(stock);
    }

    public void addItem(Item stockItem) throws Exception {
        if (stockItem == null) {
            throw new Exception();
        }
        stock.add(stockItem);
    }

    public void removeItem(Item stockItem) throws Exception {
        if (stockItem == null) {
            throw new Exception();
        }
        stock.remove(stockItem);
    }

}
