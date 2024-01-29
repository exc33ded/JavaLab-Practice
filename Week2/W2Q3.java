package Week2;
import java.util.*;
public class W2Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value for num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Value for num2: ");
        int num2 = sc.nextInt();

        System.out.println("\n1. Basic Mathematical Operations:");
        System.out.println("   Sum: " + Math.addExact(num1, num2));
        System.out.println("   Difference: " + Math.subtractExact(num1, num2));
        System.out.println("   Product: " + Math.multiplyExact(num1, num2));
        System.out.println("   Quotient: " + (double) num1 / num2); // Using regular division for simplicity
        System.out.println("   Remainder: " + Math.floorMod(num1, num2));

        // Example 2: Power and Square Root
        System.out.print("Enter Value for base: ");
        double base = sc.nextDouble();
        System.out.print("Enter Value for exponent: ");
        double exponent = sc.nextDouble();

        System.out.println("\n2. Power and Square Root:");
        System.out.println("   Power: " + Math.pow(base, exponent));
        System.out.println("   Square Root: " + Math.sqrt(base));

        // Example 3: Trigonometric Functions
        System.out.print("Enter value for angle(in degrees): ");
        double angleInDegrees = sc.nextDouble();

        System.out.println("\n3. Trigonometric Functions:");
        System.out.println("   Sine: " + Math.sin(Math.toRadians(angleInDegrees)));
        System.out.println("   Cosine: " + Math.cos(Math.toRadians(angleInDegrees)));
        System.out.println("   Tangent: " + Math.tan(Math.toRadians(angleInDegrees)));

        // Example 4: Rounding
        System.out.println("Enter value to round: ");
        double valueToRound = sc.nextDouble();

        System.out.println("\n4. Rounding:");
        System.out.println("   Round Down: " + Math.floor(valueToRound));
        System.out.println("   Round Up: " + Math.ceil(valueToRound));
        System.out.println("   Round to Nearest Integer: " + Math.round(valueToRound));

        // Example 5: Random Numbers
        System.out.println("\n5. Random Numbers:");
        System.out.println("   Random Double: " + Math.random()); 

        // Example 6: Constants
        System.out.println("\n6. Constants:");
        System.out.println("   Pi: " + Math.PI);
        System.out.println("   E: " + Math.E);
    }
}
