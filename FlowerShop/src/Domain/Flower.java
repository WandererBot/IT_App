/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

public class Flower extends Item {

    private String color;

    public Flower(double price, String color) throws Exception {
        super(price);
        if (color.equals("")) {
            throw new Exception();
        }
        this.color = color;

    }

    public String getColor() {
        return color;
    }
}
