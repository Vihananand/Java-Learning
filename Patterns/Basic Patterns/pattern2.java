/*
WAP in java to print the following pattern:
For example, n = 5
* * * * * *
*         *
*         *
*         *
* * * * * *
*/
import java.util.Scanner;

public class pattern2 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            if(i == 1 || i == n){
                for(int j = 0; j < n; j++){
                    System.out.print("*" + " ");
                }
                System.out.println();
            }
            else{
                System.out.print("*");
                for(int k = 0; k < (2 * n - 3); k++){
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }
        }
        sc.close();
    }
}
