import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int power = 1;
        num = num - 1;

        while (num % 2 == 0) {
            num = num / 2;
            power = power * 2;
        }

        if (num < power) {
            System.out.println("Proth Number");
        } else {
            System.out.println("Not a Proth Number");
        }
    }
}
