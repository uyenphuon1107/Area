/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;
import java.util.*;

/**
 *
 * @author Uyen Le
 */
public class Shapes {
    // creating a array     
    public ArrayList<Shape> shapeList = new ArrayList<Shape>();
    
        
    //this is constructor
    public Shapes(){
    }
    public Shapes(ArrayList<Shape> shapeList)
    {
        this.shapeList = shapeList;
    }
    
    // this is getter and setter of the array
    public ArrayList<Shape> getShapeList(){
        return shapeList;
    }
    
    public void setShapeList(ArrayList<Shape>shapeList){
        this.shapeList = shapeList;
    }
    
    //add Shape to the array
    public boolean add(Shape shape) {
        return shapeList.add(shape);
    }
    
    // remove shape from the array
    public boolean remove(Shape shape) {
        return shapeList.remove(shape);
    }

    //compute
    public void compute(){
        synchronized (shapeList){
            for(Shape shape : shapeList){
                try{
                System.out.println("Thread "+ Thread.currentThread().getId()+
                                   ". Shape: "+ shape.getShapeName()+
                                   ". Area of this is: "+ shape.computeArea());
                }
                catch (NullPointerException e){
                        System.out.println(e);
                }
            }
        }
    }
    
    //this is max method
     public Shape max() {
        Comparator<Shape> maxComparator = new Comparator<Shape>() {
            public int compare(Shape s1, Shape s2) {
                return Double.compare(s1.computeArea(), s2.computeArea());
            }
        };
        return Collections.max(shapeList, maxComparator);
    }

    //this is min method
    public Shape min() {
        Comparator<Shape> minComparator = new Comparator<Shape>() {
            public int compare(Shape s1, Shape s2) {
                return Double.compare(s1.computeArea(), s2.computeArea());
            }
        };
        return Collections.min(shapeList, minComparator);
    }

}
