/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;


public class Tree extends Item {

    private double height;

    public Tree(double price, double height) throws Exception {
        super(price);
        if (height <= 0) {
            throw new Exception();
        }
        this.height = height;

    }

    public double getHeight() {
        return height;
    }

}
