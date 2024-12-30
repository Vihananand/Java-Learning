/*
 WAP in java to build butterfly pattern(possible for only even number of times)
 For example, n = 8

 *           *
 * *       * *
 * * *   * * *
 * * * * * * *
 * * * * * * *
 * * *   * * * 
 * *       * *
 *           *
  
 */

import java.util.Scanner;

public class butterfly {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n >= 6){
            int spaces = (2 * n) - 5;

            //Upper part
            for(int i = 1; i <= (0.5 * n) - 1; i++){
                for(int k = 0; k < i; k++){
                    System.out.print("*" + " ");
                }
                for(int j = 0; j < spaces; j++){
                    System.out.print(" ");
                }
                spaces = spaces - 4;
                for(int l = 0; l < i; l++){
                    System.out.print(" " + "*");
                }
                System.out.println();
            }

            //Middle part
            for(int i = (n / 2); i <= (n / 2) + 1; i++){
                for(int j = 0; j < n; j++){
                    System.out.print("*" + " ");
                }
                System.out.println();
            }
            
            //Lower part
            for(int i = (int)((0.5) * n) - 1; i >= 1; i--){
                for(int l = 0; l < i; l++){
                    System.out.print("*" + " ");
                }
                spaces = spaces + 4;
                for(int j = 0; j < spaces; j++){
                    System.out.print(" ");
                }
                for(int k = 0; k < i; k++){
                    System.out.print(" " + "*");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Butterfly can't be made!!");
        }
        sc.close();
    }
}
