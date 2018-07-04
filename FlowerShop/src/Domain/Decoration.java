/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import Utilities.MaterialsEnum;

public class Decoration extends Item {

    protected MaterialsEnum material;

    public Decoration(double price, MaterialsEnum material) throws Exception {
        super(price);
        if (material == null) {
            throw new Exception();
        }
        this.material = material;

    }

    public MaterialsEnum getMaterial() {
        return material;
    }
}
