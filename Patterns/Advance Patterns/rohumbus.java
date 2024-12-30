/*
 WAP in java to build rohumbus pattern
 For example, n = 6 

          * * * * * *
        * * * * * *
      * * * * * * 
    * * * * * * 
  * * * * * *
* * * * * *

*/

import java.util.Scanner;

public class rohumbus {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int spaces = (2 * n) - 2;
        for(int i = 0; i < n; i++){
            for(int j = 1; j <= spaces; j++){
                System.out.print(" ");
            }
            spaces = spaces - 2;
            for(int k = 1; k <= n; k++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
