interface Animal{
    public void walk(); //Even if we remove the access modifier it will by default be public or abstract
}

class Horse implements Animal{
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}
public class interfaces {
    public static void main(String[] args) {
        
    }
}
