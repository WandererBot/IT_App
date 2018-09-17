/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.util.*;

/**
 *
 * @author formacio
 */
public class Rocket {

    protected String rocketID;
    protected List<Thruster> thrusters = new ArrayList<>();

    public Rocket(String name) throws Exception {
        if (name.isEmpty()) {
            throw new Exception();
        }
        this.rocketID = name;

    }

    public void addThruster(int t) throws Exception {
        Thruster thruster = new Thruster(t);
        thrusters.add(thruster);

    }

    public int currentSpeed() {
        int result = 0;
        for (Thruster t : thrusters) {
            result += t.getThrustPower();
        }
        return result;
    }

    public void throttleUP() {
        for (Thruster t : thrusters) {
            t.incThrust();
        }
    }

    public void throttleDOWN() {
        for (Thruster t : thrusters) {
            t.decThrust();
        }
    }

    public String getRocketID() {
        return rocketID;
    }

    @Override
    public String toString() {
        String result = "";
        for (Thruster t : thrusters) {
            result += t.toString();
        }
        return rocketID + "\n" + result;
    }
}
