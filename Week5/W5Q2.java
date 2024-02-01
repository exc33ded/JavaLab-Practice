package Week5;
import java.util.Scanner;

class Circle{
    private final double radius;
    private final double x_center;
    private final double y_center;
    
    Circle(double Radius, double X_center, double Y_center){
        radius = Radius;
        x_center = X_center;
        y_center = Y_center;
    }
    public double Area(double radius){
        return Math.PI * Math.pow(radius, 2);
    }
    
    public double Perimeter(double radius){
        return 2 * Math.PI * radius;
    }
    
    public boolean isPointInside(double x, double y) {
        double distance = Math.sqrt(Math.pow((x_center - x), 2) + Math.pow((y_center - y), 2));
        return distance <= radius;
    }
}

public class W5Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius, x_center, y_center;
        
        System.out.print("Enter center X Coordinate for the circle: ");
        x_center = sc.nextDouble();
        System.out.print("Enter Y Coordinate for the circle: ");
        y_center = sc.nextDouble();
            
        while (true) {
            System.out.print("Enter radius for the circle: ");
            radius = sc.nextDouble();
            
            Circle cir = new Circle(radius, x_center, y_center);
            
            if (radius < 0) {
                System.out.println("Radius is negative.");
                break;
            }
            else{
                System.out.println("---------------------------------------------");
                System.out.println("Area: " + cir.Area(radius));
                System.out.println("Perimeter: " + cir.Perimeter(radius));
                if (cir.isPointInside(x_center, y_center)){
                    System.out.println("Points lie inside the circle");
                }
                else{
                    System.out.println("Points lie outside the circle");
                }
            }
        }
    }
}

