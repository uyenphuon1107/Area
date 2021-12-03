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
public class Hexagon extends Shape implements Serializable{
    public double side;
    
    //this is constructor
    public Hexagon(String shapeName, double side) {
        super(shapeName);
        this.side = side;
    }
    
    //this is getter and setter
    public Hexagon(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    
    public double computeArea(){
        double area = (0.5*3*Math.sqrt(3)*side*side);
        return area;
    }
    
    @Override
    public String toString(){
        return "Shape: "+ super.toString()+ " area: "+ computeArea();
    }
    
    
}
