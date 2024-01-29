package Week3;
import java.util.Scanner;
public class W3Q5i {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length for the Triangle: ");
        int n = sc.nextInt();

        int i, j, k = 1;

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {

                System.out.print(k + "  ");
                k++;
            }

            System.out.println();
        }
    }
}
