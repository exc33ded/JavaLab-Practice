package Week3;
import java.util.Scanner;
public class W3Q2 {
    public static void main(String[] args) {
        System.out.println("Number\tSquare\tCube");

        for (int i = 1; i <= 5; i++){
            int square = i * i;
            int cube = i * i * i;

            System.out.printf("%-7d %-7d %-7d%n", i, square, cube);
        }
    }
}