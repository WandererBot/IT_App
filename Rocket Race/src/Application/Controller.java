/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import Domain.*;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author formacio
 */
public class Controller {

    private static List<Rocket> spaceships = new ArrayList<>();
    public int selectedVessel = 0;

    public Controller() {
    }

    public void createRocket(String name) throws Exception {
        Rocket rocketShip = new Rocket(name);
        spaceships.add(rocketShip);
    }

    public void createThruster(String rocketID, int thrust) throws Exception {
        for (Rocket r : spaceships) {
            if (rocketID.equals(r.getRocketID())) {
                r.addThruster(thrust);
            }
        }
    }

    public void selectTarget(int position) {
        if (position == 1) {
            selectedVessel++;
        }
        else if (position ==-1){
            selectedVessel--;
        }
        if(selectedVessel ==-1){
            selectedVessel = 0;
        }
        else if(selectedVessel == spaceships.size()){
            selectedVessel--;
        }
    }
    
    public void throttleUp_vessel() {
        String rocketID = spaceships.get(selectedVessel).getRocketID();
        for (Rocket r : spaceships) {
            if (r.getRocketID().equals(rocketID)) {
                r.throttleUP();
            }
        }
    }
    public void throttleDown_vessel(){
        String rocketID = spaceships.get(selectedVessel).getRocketID();
        for (Rocket r : spaceships) {
            if (r.getRocketID().equals(rocketID)) {
                r.throttleDOWN();
            }
        }
    }

    public void getCurrentSpeed() {
        for (Rocket r : spaceships) {
            System.out.println(r.getRocketID());
            System.out.println(r.currentSpeed());
        }
    }

    public void printAllRockets() {
        for (Rocket r : spaceships) {
            System.out.println(r.toString());
        }
    }

}
