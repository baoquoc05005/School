/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_example;
// prior version 8
public interface IShape {
    public int ID=1000;
    
    default double getArea(){
     
        return 0.0;
    }
    abstract void display();
    static void info(){
        System.out.println("Static method inside Interface");
    }    
}
