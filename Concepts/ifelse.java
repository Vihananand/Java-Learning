package Concepts;
import java.util.Scanner;

public class ifelse {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age > 18){ //We can avoid curly braces if we have to implement only one statement after if block but if we have to implement multiple statement after if block we have to use curly braces
            System.out.println("You are an adult!!");
        }
        else if(age == 18){
            System.out.println("You just became an adult!!");
        }
        else{
            System.out.println("You are not an adult!!");
        }
        sc.close();
    }
}
