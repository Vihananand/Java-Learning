import java.util.Scanner;

public class forLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();

        for(int i = 1; i <= times; i++){
            System.out.print(i + " ");
        }
    }
}
