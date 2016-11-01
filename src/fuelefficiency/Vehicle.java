/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuelefficiency;

import javax.swing.*;

/**
 *
 * @author user
 */
public class Vehicle {
    static String name;
    public Vehicle(){
        name = JOptionPane.showInputDialog("How many L are you using?");
        
    }
    public double getDistance(double litresUsed){
        double distance = litresUsed * 100;
        JOptionPane.showInputDialog(distance);
        return distance;
    }
}
