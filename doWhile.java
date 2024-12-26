import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        int i = 1;
        do { 
            System.out.print(i + " ");
            i++;
        } while (i <= times);
    }
}
