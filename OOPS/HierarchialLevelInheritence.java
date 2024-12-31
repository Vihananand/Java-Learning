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
