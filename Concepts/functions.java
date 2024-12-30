/*
 1. Functions in java is called in the form of stack and the stack created for each function is called stack frame.

 2. Function that is called first gets destroyed at last.
 */

import java.util.Scanner;

public class functions {
    public static int Sum(int a, int b) {
        return  a + b;
    }
    public static int Factorial(int a) {
        int fac = 1;
        if(a < 0){
            System.out.println("Factorial not possible!!");
        }
        else{
            for(int i = 1; i <= a; i++){
                fac = fac * i;
            }
        }
        return fac;
    }
    public static void printName(String name){
        System.out.println("Your name is " + name);
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        printName(name);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = Sum(a, b);
        System.out.println(result);

        int c = sc.nextInt();
        int factorial = Factorial(c);
        System.out.println(factorial);
        sc.close();
    }
}
