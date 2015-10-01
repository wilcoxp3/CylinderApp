/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cylinderapp;

/**
 *
 * @author wilcoxp3
 * The Cylinder class defines an object which represents a cylinder shape. In
 * addition to the inherited field radius, it also contains the field height.
 * All other properties of the cylinder (area, circumference, volume) are
 * derived from these two fields.
 */
public class Cylinder extends Circle {
    
    protected double height;
    
    public Cylinder() {
        super();
        this.height = 1.0d;
    }
    
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getHeight() {
        return this.height;
    }
    
    public double getVolume() {
        return super.getArea() * this.height;
    }
    
    public double getSurfaceArea() {
        return this.getCircumference() * this.height + 2 * this.getArea();
    }
    
}
