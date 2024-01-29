package Week3;
import java.util.Scanner;
public class W3Q3 {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 10; i++){
            sum += 1.0 / i;
        }
        System.out.println("The sum of the reciprocals is " + sum);
    }
}
