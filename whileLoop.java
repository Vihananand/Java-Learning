import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();

        int i = 1;
        while (i <= times) {
            System.out.print(i + " ");
            i++;
        }
        sc.close();
    }
}
