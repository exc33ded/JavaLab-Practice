package Week3;
import java.util.Scanner;

public class W3Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        System.out.print("Enter then number of rows to produce: ");
        int n = sc.nextInt();
        System.out.println("\nPart 1\n");
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
        
    System.out.println("\nPart 2\n");

    for(int i = 1; i <= n; i++) {
        for(int j = 1; j <= i; j++) {
            System.out.print((i + j) % 2 + " ");
        }
        System.out.println();
    }
    }
}

