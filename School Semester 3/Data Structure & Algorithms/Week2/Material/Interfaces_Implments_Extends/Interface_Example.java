package interface_example;


public class Interface_Example {

    public static void main(String[] args) {
       IShape c = new Circle(10,"red");
      
       IShape.info();// c does not have access t to info
       
       
    }
    
}
