/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance_app;

/**
 *
 * @author user
 */
public class Inheritance_app {

    static void display(Shape sh){
        
        if(sh instanceof Rectangle){
            System.out.println("Width: " + ((Rectangle)sh).getWidth());
        }
        else if(sh instanceof Circle){
             System.out.println("Radius: " + ((Circle)sh).getRadius());
        }
        else
            System.out.println("Invalid object");
       
         System.out.println("Area: " + sh.getArea());    
    }
    
    public static void main(String[] args) {
     
        Shape  rec = new Rectangle(10,10, "Red", true);  
        Shape c = new Circle(10,"red", true);
        display(c);
      /*  Rectangle  rec = new Rectangle(10,10, "Red", true);        
        Shape[] array = new Shape[3];
        
        array[0]= new Circle(10,"red", true);
        array[1]= new Circle(5,"blue", false);
        array[2]= rec;
        
        for(int i=0;i<array.length; i++)
            System.out.println(i+" "+ array[i].toString());
        */
       
    }
    
}
