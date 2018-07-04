/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import Domain.*;
import Utilities.MaterialsEnum;

/**
 *
 * @author formacio
 */
public class ItemDTO {

    protected double price=0;
    protected double height=0;
    protected String color="";
    protected MaterialsEnum material;

    public ItemDTO(Item item) {
        price = item.getPrice();
        if(item instanceof Decoration) initDecorationDTO((Decoration) item);
        else if(item instanceof Tree) initTreeDTO((Tree) item);
        else initFlowerDTO((Flower) item);
        
    }

    private void initTreeDTO(Tree tree) {
        height = tree.getHeight();
    }

    private void initFlowerDTO(Flower flower) {
        color = flower.getColor();
    }

    private void initDecorationDTO(Decoration deco) {
        material = deco.getMaterial();
    }
    
    @Override
    public String toString(){
        String result = "price: " + price;
        
        result +=  (height > 0.0) ? "/ height: " + height : "";
        result +=  (!color.equals("")) ? "/ color: " + color : "";
        result +=  (material != null) ? "/ material: " + material : "";
        return result + "\n";
    }
}
