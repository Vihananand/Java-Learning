/*
 1. This is single level inheritence.
 2. In this type of inheritence a class derives the property from the base class
 */
class Shape{
    public void displayArea(){
        System.out.print("Area is: ");
    }
}

class Triangle extends Shape{
    double area = 20.08;
    public void display(){
        System.out.println(area);
    }
}

public class SingleLevelInheritence {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.displayArea();
        t1.display();
    }    
}
