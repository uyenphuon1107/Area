/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;
import java.io.*;
/**
 *
 * @author Uyen Le
 */
public class Circle extends Shape implements Serializable {
    public double radius;
    
    // this is constructor
    public Circle(){}
    public Circle(String shapeName, double radius) {
        super(shapeName);
        this.radius = radius;
    }
    
    // this is getter and setter 
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double computeArea(){
        double area = (3.14 * radius * radius);
        return area;
    }
    
    @Override
    public String toString(){
        return "Shape: "+ super.toString() + 
               " area: " + computeArea();
    }
}
