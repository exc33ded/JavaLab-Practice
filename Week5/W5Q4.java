package Week5;
import java.util.Scanner;

class Commission {
    private double sale;

    public Commission(double sale) {
        this.sale = sale;
    }

    public double commission() {
        if (sale < 500) {
            return sale * 0.02;
        } else if (sale <= 5000) {
            return sale * 0.05;
        } else {
            return sale * 0.08;
        }
    }
}

public class W5Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sale amount:");
        double sale = sc.nextDouble();

        if (sale < 0) {
            System.out.println("Invalid Input");
        } else {
            Commission commission = new Commission(sale);
            System.out.println("The commission is: " + commission.commission());
        }
        
        sc.close();
    }
}
