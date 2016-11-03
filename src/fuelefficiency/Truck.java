/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuelefficiency;

/**
 *
 * @author user
 */
public class Truck extends Vehicle {

    public double getDistance(double litresUsed) {
        double d = litresUsed * 7.092198582;
        int distance = (int) d;
        return distance;
    }
}
