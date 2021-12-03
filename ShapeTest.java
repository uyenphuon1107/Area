/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;
import java.util.ArrayList;
/**
 *
 * @author Uyen Le
 */

// this is main class
public class ShapeTest {
     public static void main(String[] args){
         // object of Shape class
         ArrayList<Shape> sh = new ArrayList<>();
         
         
         Triangle t1 = new Triangle("Triangle",4,5);
         sh.add(t1);
         Triangle t2 = new Triangle("Triangle",5,6);
         sh.add(t2);
         
         Circle c1 = new Circle("Circle",4);
         sh.add(c1);
         Circle c2 = new Circle("Circle",6);
         sh.add(c2);
         
         Rectangle r1 = new Rectangle("Rectangle",3,5);
         sh.add(r1);
         Rectangle r2 = new Rectangle("Rectangle",4,7);
         sh.add(r2);
 
         Hexagon h1 = new Hexagon("Hexagon",4);
         sh.add(h1);
         Hexagon h2 = new Hexagon("Hexagon",6);
         sh.add(h2);
   
         Shapes shList = new Shapes(sh);

        for (int i = 0; i <= 3; i++) {
            new Thread() {
                public void run() {
                    {
                        try {
                            Thread.sleep(100);
                            shList.compute();
                        } 
                        catch (Exception ex) {
                            System.out.println(ex);
                        }
                    }
                }
            }.start();
        }
        
        System.out.println("The maximum is: "+ shList.max());
        System.out.println("The minimum is: "+ shList.min());
        System.out.println("");

    }

}
 