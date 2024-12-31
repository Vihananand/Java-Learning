class Student{
    String name;
    int age;

    //This is called function overloading, now you may notice that all the function of this class have the same name but either they have diffrent number of parameters or different type of parameter
    public void printInfo(String name){
        System.out.println("Name: " + name);
    }
    public void printInfo(int age){
        System.out.println("Age: " + age);
    }
    public void printInfo(String name, int age){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Vihan Anand";
        s1.age = 20;
        s1.printInfo(s1.name, s1.age);
    }
}
