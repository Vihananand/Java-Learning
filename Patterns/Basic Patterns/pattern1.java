/*
WAP in java to print the following pattern:
For example, n = 5
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *
*/

import java.util.Scanner;

class pattern1{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}