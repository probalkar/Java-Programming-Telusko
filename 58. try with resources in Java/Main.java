import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){  // scanner automatically closes
            System.out.println("Enter a number:");
            int num = scanner.nextInt();
            System.out.println(num);
        }
    }
}