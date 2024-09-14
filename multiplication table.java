import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long nlimit = scanner.nextLong();
        long multiplicand = scanner.nextLong();

        for (long num = 1; num <= nlimit; num++) {
            System.out.printf("%d * %d = %d\n", num, multiplicand, num * multiplicand);
        }
    }
}
