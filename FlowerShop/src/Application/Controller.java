/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import Domain.*;
import java.util.*;
import Utilities.MaterialsEnum;

/**
 *
 * @author formacio
 */
public class Controller {

    private static FlowerShop shop;

    public Controller() throws Exception {
        shop = FlowerShop.getFlowerShop();
    }

    public void createTree(double price, double height) throws Exception {
        Item tree = new Tree(price, height);
        shop.addItem(tree);
    }

    public void createFlower(double price, String color) throws Exception {
        Item flower = new Flower(price, color);
        shop.addItem(flower);
    }

    public void createDecoration(double price, MaterialsEnum material) throws Exception {
        Item decoration = new Decoration(price, material);
        shop.addItem(decoration);
    }

    public void setShopName(String name) throws Exception {
        if (shop == null) {
            throw new Exception();
        }
        shop.setName(name);
    }

    public List<ItemDTO> getAllItems() throws Exception {
        List<Item> stock = shop.getAllItems();
        List<ItemDTO> itemsDTO = new ArrayList<>();
        for (Item i : stock) {
            itemsDTO.add(new ItemDTO(i));            
        }
        return itemsDTO;
    }
}
