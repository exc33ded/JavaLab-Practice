package Week5;
import java.util.Scanner;

class OddAndEven {
    private int countOfOdd;
    private int countOfEven;

    public void addNumber(int number) {
        if (number % 2 == 0) {
            countOfEven++;
        } else {
            countOfOdd++;
        }
    }

    @Override
    public String toString() {
        return "Number of Odd: " + countOfOdd + ", Number of Even: " + countOfEven;
    }
}

public class TestOddAndEven {
    public static void main(String[] args) {
        OddAndEven oddAndEven = new OddAndEven();
        Scanner sc = new Scanner(System.in);
        String input;

        System.out.println("Enter numbers (Q to quit):");
        
        while (!(input = sc.nextLine()).equalsIgnoreCase("Q")) {
            int number = Integer.parseInt(input);
            oddAndEven.addNumber(number);
        }

        System.out.println(oddAndEven);
    }
}

