package Week3;
import java.util.Scanner;

public class W3Q5ii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            System.out.print("");

            for (int j = 1; j <= i; j++) {
                System.out.print(j % 2 == 0 ? "0" : "1");
            }

            System.out.println();
        }
    }
}

