/*
 1. This is hierarchial type of inheritence.
 2. In this type of inheritence there are multiple classes that derive the property of one basee class
 */
class Shape{
    int area;
}

class Triangle extends Shape{
    public void displayArea(int base, int height){
        System.out.println("Area: " + (int)(0.5 * base * height));
    }
}

class Circle extends Shape{
    public void displayArea(int radius){
        System.out.println("Area: " + (int)(3.14 * radius * radius));
    }
}

public class HierarchialLevelInheritence {
    public static void main(String[] args) {
        
    }
}
