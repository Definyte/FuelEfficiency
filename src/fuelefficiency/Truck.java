/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuelefficiency;
//import javax.swing.*;
/**
 *
 * @author user
 */
public class Truck extends Vehicle {
//    public Truck(){
//        name = JOptionPane.showInputDialog("What is the name of your vehicle?");
//    }
    public double getDistance(double litresUsed){
        double distance = litresUsed * 7.092198582;
        return distance;
    }
}
