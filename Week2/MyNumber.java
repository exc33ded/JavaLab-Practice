package Week2;
import java.util.*;
public class MyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        double num = sc.nextDouble();

        System.out.print("Round of Number: ");
        double numRound = Math.round(num);
        System.out.println(numRound);

        System.out.print("Ceil of Number: ");
        double numCeil = Math.ceil(num);
        System.out.println(numCeil);

        System.out.print("Floor value of Number: ");
        double numFloor = Math.floor(num);
        System.out.println(numFloor);

        System.out.print("Casting Number to INT: ");
        int numInteger = (int) num;
        System.out.println(numInteger);
    }
}
