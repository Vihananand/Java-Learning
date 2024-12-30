/*
 1. Java has a very good functionality of garbage collection.
 2. Garbage collection is the property by which the unused variables and function that are taking space in the memory but are not required is removed automatically.
 */

//blueprint of a class
class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Writing with the pen!!");
    }
    public void showColor(){
        System.out.println("Colour of the pen is " + this.color); //this specifies which object is reffering to that particular property of the class. For example, if I have 2 objects p1 and p2 then p1 will be specified with its own property and p2 will be specified wtih its own.
    }
    public void showType(){
        System.out.println("Pen is of " + this.type + " type");
    }
}

class Student{
    String name;
    int age;
    int rollNo;

    //Non-parameterized Constructor
    // Student(){
    //     System.out.println("Constructor called!!");
    // }

    //Parameterized constructor
    Student(String name, int age, int rollNo){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    public void showDetails(){
        System.out.println("Name of the student is " + this.name);
        System.out.println("Age of the student is " + this.age);
        System.out.println("Roll No. of the student is " + this.rollNo);
    }
}

public class classBlueprint {
    public static void main(String[] args) {
        Pen p1 = new Pen(); //Making a class object
        p1.write();
        p1.color = "Red"; //Initializing the property of a class 
        p1.type = "Gel";
        p1.showColor(); //Running the functions of class
        p1.showType();

        System.out.println();

        Pen p2 = new Pen();
        p2.write();
        p2.color = "Blue";
        p2.type = "Ballpoint";
        p2.showColor();
        p2.showType();

        System.out.println();

        Student s1 = new Student("Vihan Anand", 20, 56); //"Student()" after the 'new' keyword is called constructor so when we create the object of a class we call the constructor along with it
        //Constructor have the same name as that of class.
        //Constructor dont have any return type.
        //Constructor is called only once while creation of the object.
        s1.showDetails();

        System.out.println();

        Student s2 = new Student("Nancy Kumari", 21, 57);
        s2.showDetails();
    }
}
