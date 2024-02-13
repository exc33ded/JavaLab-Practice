package Week4;
import java.util.Scanner;

public class W4Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three digits (0-9) with space between them: ");
        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("All possible combinations are:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j != i) {
                    for (int k = 0; k < 3; k++) {
                        if (k != i && k != j) {
                            System.out.println(numbers[i] + "" + numbers[j] + "" + numbers[k]);
                        }
                    }
                }
            }
        }
        sc.close();
    }
}
