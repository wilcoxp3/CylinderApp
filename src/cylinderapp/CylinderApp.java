/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cylinderapp;

/**
 *
 * @author paul
 */
public class CylinderApp {

        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Welcom to the Cirlce/Cylinder Application!");

        while (true) {

            int userChoice = Validation.getInt("Enter 1 to compute a circle, "
                    + "2 to compute a cylinder, and 3 to quit: ");

            if (userChoice == 3) {

                break;

            } else if (userChoice == 1) {

                Circle myCircle = new Circle();

                double radius = Validation.getDouble("\nEnter circle radius: ");
                myCircle.setRadius(radius);

                System.out.println("\nCircle radius: " + myCircle.getRadius());
                System.out.println("Circle diameter: " + myCircle.getDiameter());
                System.out.println("Circle circumference: " + myCircle.getCircumference());
                System.out.println("Circle area: " + myCircle.getArea());

            } else if (userChoice == 2) {

                Cylinder myCylinder = new Cylinder();

                double radius = Validation.getDouble("\nEnter cylinder radius: ");
                myCylinder.setRadius(radius);

                double height = Validation.getDouble("Enter cylinder height: ");
                myCylinder.setHeight(height);

                System.out.println("\nCylinder radius: " + myCylinder.getRadius());
                System.out.println("Cylinder height: " + myCylinder.getHeight());
                System.out.println("Cylinder diameter: " + myCylinder.getDiameter());
                System.out.println("Cylinder circumference: " + myCylinder.getCircumference());
                System.out.println("Cylinder area: " + myCylinder.getSurfaceArea());
                System.out.println("Cylinder volume: " + myCylinder.getVolume());

            } else {

                System.out.println("Invalid choice.");

            }

            System.out.println("\nWould you like to compute a shape again?");

        }
        System.out.println("DONE");
    }
    
}
