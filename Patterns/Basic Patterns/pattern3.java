/*
WAP in java to print the following pattern:
For example, n = 5
* 
* * 
* * * 
* * * * 
* * * * *
*/

import java.util.Scanner;

public class pattern3 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
