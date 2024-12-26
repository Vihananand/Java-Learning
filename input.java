import java.util.Scanner;

public class input {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.next(); // Takes only the first word
        String name2 = sc.nextLine(); // Takes the whole name
        System.out.println(name1);
        System.out.println(name2);
        sc.close();
    }
}
