/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cylinderapp;

/**
 *
 * @author wilcoxp3
 * 
 * The Circle class defines an object which represents a circle shape. It has a single
 * field, radius, from which all other values (diameter, circumference, area)
 * are derived.
 */
public class Circle {
    
    protected double radius;
    
    public Circle() {
        this.radius = 1.0d;
    }
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }
    
    public double getDiameter() {
        return 2 * this.radius;
    }
    
    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }
    
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
