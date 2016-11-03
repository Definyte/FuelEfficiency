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
public abstract class Vehicle {
    static String litres;
    public Vehicle(){
        litres = "";
    }
    abstract public double getDistance(double litresUsed);
}
