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
public class Motorcycle extends Vehicle {

    public double getDistance(double litresUsed) {
        double d = litresUsed * 15.87301587;
        int distance = (int) d;
        return distance;
    }
}
