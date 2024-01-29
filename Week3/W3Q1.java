package Week3;
import java.util.Scanner;
public class W3Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int even_count = 0, odd_count = 0, counter = 0;
        System.out.print("Enter how many numbers to take: ");
        int input = sc.nextInt();

        while (counter < input){
            System.out.print(">>");
            int num = sc.nextInt();
            if (num % 2 == 0){
                even_count++;
            }
            else {
                odd_count++;
            }
            counter++;
        }

        System.out.println("Count for even: " + even_count);
        System.out.println("Count for odd: " + odd_count);
    }
}
