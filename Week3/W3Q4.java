package Week3;
import java.util.Scanner;
public class W3Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Limit: ");
        int limit = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= limit; i++){
            if (i % 2 == 0){
                sum += i;
            }
        }
        System.out.println("The sum of the element is " + sum);
    }
}
