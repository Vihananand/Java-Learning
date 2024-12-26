import java.util.Scanner;

public class ruleswitchCaseStatements {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        //This is rule switch in which curly braces are avoided to make the code short
        switch (c) {
            case 1 -> System.out.println("1");
            case 2 -> System.out.println("2");
            case 3 -> System.out.println("3");
            case 4 -> System.out.println("4");
            case 5 -> System.out.println("5");
            default -> System.out.println("Invalid Input!!");
        }
        sc.close();
    }
}
