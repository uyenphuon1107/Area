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
public class Triangle extends Shape implements Serializable{
    public double base;
    public double height;

    
    //this is constructor
    
    public Triangle(String shapeName, double base, double height) {
        super(shapeName);
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public double computeArea(){
        double area = (double)(0.5 * base * height);
        return area;
    }
    
    @Override
    public String toString(){
        return "Shape: "+ super.toString()+ " area: "+ computeArea();
    }
    
            
}
