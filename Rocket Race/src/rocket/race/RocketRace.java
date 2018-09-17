/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rocket.race;

import Application.Controller;
import java.util.Scanner;

/**
 *
 * @author formacio
 */
public class RocketRace {

    /**
     * @param args the command line arguments
     */
    private static Controller controller = new Controller();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        controller.createRocket("32WESSDS");
        controller.createThruster("32WESSDS", 12);
        controller.createThruster("32WESSDS", 30);
        controller.createThruster("32WESSDS", 80);
        
        controller.createRocket("LDSFJA32");
        controller.createThruster("LDSFJA32", 33);
        controller.createThruster("LDSFJA32", 40);
        controller.createThruster("LDSFJA32", 50);
        controller.createThruster("LDSFJA32", 50);
        controller.createThruster("LDSFJA32", 30);
        controller.createThruster("LDSFJA32", 10);
        
        
        System.out.println("Use W - for throttle up the vessel."+"\n "+"S - to throttle down the vessel"+
                "\n"+"Press A and D to change between vessels"+"\n"+"Press E to display the current speed"+"\n"+ "Press Q to exit");
        System.out.println("");
        controller.printAllRockets();

        String input = sc.nextLine();
        while (!input.equalsIgnoreCase("Q")) {
            if (input.equalsIgnoreCase("W")) {
                controller.throttleUp_vessel();
                controller.printAllRockets();
            }
            else if (input.equalsIgnoreCase("S")) {
                controller.throttleDown_vessel();
                controller.printAllRockets();
            }
            else if (input.equalsIgnoreCase("D")) {
                controller.selectTarget(1);
                System.out.println(controller.selectedVessel);
            }
            else if(input.equalsIgnoreCase("A")){
                controller.selectTarget(-1);
                System.out.println(controller.selectedVessel);
            }
            else if(input.equalsIgnoreCase("E")){
                controller.getCurrentSpeed();
            }
            else{
                System.out.println("Please enter a correct command");
            }
            input = sc.nextLine();
        }

    }
}
