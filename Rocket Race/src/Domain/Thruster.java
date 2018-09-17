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
public class Thruster {

    protected int thrustPower = 0;
    protected int maxThrust;

    public Thruster(int thruster) throws Exception {
        if (thruster < 0) {
            throw new Exception();
        }
        this.maxThrust = thruster;
    }

    public void incThrust() {
        thrustPower = Math.min(thrustPower + 10, maxThrust);
    }

    public void decThrust() {
        thrustPower = Math.max(thrustPower - 10, 0);
    }

    public int getMaxThrust() {
        return maxThrust;
    }

    public int getThrustPower() {
        return thrustPower;
    }

    @Override
    public String toString() {
        return "thrust: " + thrustPower + " " + "thruster limit: " + maxThrust + "\t";
    }
}
