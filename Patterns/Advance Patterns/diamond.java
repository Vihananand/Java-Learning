/*
 WAP in java to build diamond pattern (odd numbers only)
 For example, n = 7 
      *
    * * *
  * * * * *
* * * * * * *
* * * * * * *
  * * * * * 
    * * *
      *
 */

import java.util.Scanner;

public class diamond {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 != 0 && n >= 3) {
            int spaces = n - 1;
            int count = 1;
            for (int i = 0; i < (0.5 * n); i++) {
                for (int j = 0; j < spaces; j++) {
                    System.out.print(" ");
                }
                spaces = spaces - 2;
                for (int j = 0; j < (2 * count) - 1; j++) {
                    System.out.print("*" + " ");
                }
                count++;
                System.out.println("");
            }

            count = n;
            spaces = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < spaces; j++) {
                    System.out.print(" ");
                }
                spaces = spaces + 2;
                for (int j = 0; j < count; j++) {
                    System.out.print("*" + " ");
                }
                count = count - 2;
                System.out.println("");
            }
        }
        else{
            System.out.println("Diamond not possible!!");
        }
        sc.close();
    }
}
