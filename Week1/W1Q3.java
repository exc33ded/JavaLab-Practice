package Week1;

import java.util.*;
public class W1Q3 {
    public int addition(int num1, int num2){
        return num1+num2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.print("Enter Number 1: ");
        num1 = sc.nextInt();
        System.out.print("Enter Number 2: ");
        num2 = sc.nextInt();

        W1Q3 cal = new W1Q3();

        System.out.println("The Sum of the two numbers is " + cal.addition(num1, num2));
    }
}
