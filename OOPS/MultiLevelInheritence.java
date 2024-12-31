/*
 1. The type of inheritence that is done here is multi level inheritence.
 2. In this type of inheritence a derived class inherits the property from base class and another class inherits the property from derived class
 */
class Shape{
    int area;
}

class Triangle extends Shape{
    public void displayArea(int base, int height){
        System.out.println("Area: " + (int)(0.5 * base * height));
    }
}

class EquilateralTriangle extends Triangle{
    public void displayArea(int side){
        System.out.println("Area: " + (int)(0.5 * side * side));
    }
}

public class MultiLevelInheritence {
    public static void main(String[] args) {
        
    }
}
