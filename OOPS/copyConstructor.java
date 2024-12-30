class Student{
    String name;
    int age;
    int rollNo;

    //This is the copy constructor which is used to copy the properties of one object to another object
    //Gue to the property of "garbage collection" of java constructor have destructors. Destructors automatically remove the constructor from the memory once they are used so thet memory is free from junk
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
        this.rollNo = s2.rollNo;
    }

    //Default Constructor
    Student(){
    }

    public void showDetails(){
        System.out.println("Name of the student is " + this.name);
        System.out.println("Age of the student is " + this.age);
        System.out.println("Roll No. of the student is " + this.rollNo);
    }
}

public class copyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Vihan Anand";
        s1.age = 20;
        s1.rollNo = 56;

        Student s2 = new Student(s1);
        s2.showDetails();
    }
}
