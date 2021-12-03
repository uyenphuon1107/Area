/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

import java.io.Serializable;

/**
 *
 * @author Uyen Le
 */
public class Rectangle extends Shape implements Serializable {
    private double length;
    private double width;
    
    //this is constructor
    public Rectangle(){}
    public Rectangle(String shapeName, double width, double length) {
        super(shapeName);
        this.width = width;
        this.length = length;
    }
 
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    public double computeArea(){
        double area = length* width;
        return area;
    }
    
    @Override
    public String toString(){
        return "Shape: "+ super.toString()+ " area: "+ computeArea();
    }
}
