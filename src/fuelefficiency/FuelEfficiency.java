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
public class FuelEfficiency {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Array with the different types of vehicles
        Vehicle theArray[] = new Vehicle[5];

        String choice;

        //Fill Array
        for (int i = 0; i < 5; i++) {
            choice = JOptionPane.showInputDialog(
                    "Vehicle #\n"
                    + "1 Truck\n"
                    + "2 Car\n"
                    + "3 Hyrbrid Car\n"
                    + "4 Motorcycle");
            //Ask for amount of L's
            String litres = JOptionPane.showInputDialog("How many L are you using?");
            double litresUsed = Double.parseDouble(litres);
            if (choice.equals("1")) {
                theArray[i] = new Truck();
            }
            if (choice.equals("2")) {
                theArray[i] = new Car();
            }
            if (choice.equals("3")) {
                theArray[i] = new HybridCar();
            }
            if (choice.equals("4")) {
                theArray[i] = new Motorcycle();
            }
            //Display distance and exit
            JOptionPane.showMessageDialog(null, theArray[i].getDistance(litresUsed)+ " km's");
            System.exit(0);
        }

    }

}
