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

public class pattern5 {
   @SuppressWarnings("ConvertToTryWithResources")
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 5; i > 0 ; i--){
            for(int j = 0; j < (2 * i - 2); j++){
                System.out.print(" ");
            }
            for(int k = 0 ; k < n - (i - 1); k++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        sc.close();
   } 
}
