import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dd, mm, yy, nod = 0;
        long remdays;
        
        dd = scanner.nextInt();
        mm = scanner.nextInt();
        yy = scanner.nextInt();
        
        switch (mm - 1) {
            case 12:
                nod += 31;
            case 11:
                nod += 30;
            case 10:
                nod += 31;
            case 9:
                nod += 30;
            case 8:
                nod += 31;
            case 7:
                nod += 31;
            case 6:
                nod += 30;
            case 5:
                nod += 31;
            case 4:
                nod += 30;
            case 3:
                nod += 31;
            case 2:
                if ((yy % 4 == 0 && yy % 100 != 0) || yy % 400 == 0)
                    nod += 29;
                else
                    nod += 28;
            case 1:
                nod += 31;
                break;
        }
        
        nod += dd;
        
        if ((yy % 4 == 0 && yy % 100 != 0) || yy % 400 == 0)
            remdays = 366 - nod;
        else
            remdays = 365 - nod;
        
        System.out.println(remdays);
    }
}
