/*
 WAP in java to build number pyramid pattern
 For example, n = 6 
     1
    2 2 
   3 3 3
  4 4 4 4
 5 5 5 5 5
6 6 6 6 6 6
*/

import java.util.Scanner;

public class numberPyramid {
 @SuppressWarnings("ConvertToTryWithResources")
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int spaces = n - 1;
    int x = 1;
    for(int i = 0; i < n; i++){
        for(int j = 0; j < spaces; j++){
            System.out.print(" ");
        }
        spaces--;
        for(int k = 0; k < i + 1; k++){
            System.out.print(x + " ");
        }
        x++;
        System.out.println();
    } 
    sc.close();
 }  
}
