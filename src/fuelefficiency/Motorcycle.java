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
public class Motorcycle extends Vehicle {
//    public Motorcycle(){
//        name = JOptionPane.showInputDialog("What is the name of your vehicle?");
//    }
    public double getDistance(double litresUsed){
        double distance = litresUsed * 15.87301587;
        return distance;
    }
}
