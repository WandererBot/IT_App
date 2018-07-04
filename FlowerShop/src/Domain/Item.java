/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author formacio
 */
public abstract class Item {

    protected double price;

    public Item(double price) throws Exception {
        if (Double.isNaN(price)) {
            throw new Exception();
        }
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

}
