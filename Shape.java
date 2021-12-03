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
public abstract class Shape implements Serializable {
        private String shapeName;
        
        
        //this is constructor
        public Shape (){}
        public Shape (String shapeName){
            this.shapeName = shapeName;
        }
        
        //this is getter and setter 
        public String getShapeName() {
            return shapeName;
        }

        public void setShapeName(String shapeName) {
            this.shapeName = shapeName;
        }
        
        // compute area
        public abstract double computeArea();
        
        @Override 
        public String toString(){
            return shapeName;
        }
        
   
    

       
}
