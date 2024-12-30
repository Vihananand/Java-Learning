/*
WAP in java to print the following pattern:
For example, n = 5
* * * * *
* * * *
* * *
* *
*
*/
import java.util.Scanner;

public class pattern4 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = n; i > 0; i--){
            for(int j = i; j > 0; j--){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
