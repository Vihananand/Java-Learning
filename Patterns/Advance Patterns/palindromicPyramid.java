/*
 WAP in java to build number pyramid pattern
 For example, n = 5 
        1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5
*/

import java.util.Scanner;

public class palindromicPyramid {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int spaces = (2 * n) - 2;
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < spaces; j++){
                System.out.print(" ");
            }
            spaces = spaces - 2;
            for(int k = i; k > 0; k--){
                System.out.print(k + " ");
            }
            for(int l = 2; l <= i; l++){
                System.out.print(l + " ");
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
