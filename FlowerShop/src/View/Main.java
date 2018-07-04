/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Application.Controller;
import Utilities.MaterialsEnum;

/**
 *
 * @author formacio
 */
public class Main {

    static Controller controller;

    public static void main(String[] args) throws Exception {
        controller = new Controller();
        controller.setShopName("Floristeria Paquita");
        controller.createTree(200,30.35);
        controller.createTree(400,40.35);
        controller.createFlower(25, "Roja");
        controller.createDecoration(300,MaterialsEnum.PLASTIC);
        
        System.out.println(controller.getAllItems());
    }
}
