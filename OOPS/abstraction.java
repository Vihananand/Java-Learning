abstract class Animal{
    abstract void walk();
}

class Horse extends Animal{
    public void walk(){
        System.out.println("Walks on 4 legs.");
    }
}

class Gorilla extends Animal{
    public void walk(){
        System.out.println("Can walk on 2 legs.");
    }
}

public class abstraction {
    public static void main(String[] args) {
        Gorilla g1 = new Gorilla();
        g1.walk();
        Horse h1 = new Horse();
        h1.walk();
    }
}
