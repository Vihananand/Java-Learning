/*
WAP in java to print the Floyd's triangle:
For example, n = 5
1 
0 1
1 0 1
0 1 0 1
1 0 1 0 1
*/

import java.util.Scanner;

public class pattern7 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int zero = 0;
        int one = 1;
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                for(int j = 0; j < i / 2; j++){
                    System.out.print(zero + " ");
                    System.out.print(one + " ");
                }
            }
            else{
                System.out.print(one + " ");
                for (int k = 0; k < i / 2; k++) {
                    System.out.print(zero + " ");
                    System.out.print(one + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
