package Week4;
import java.util.Scanner;

class Rectangle {
    int x, y, width, height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public Rectangle intersection(Rectangle other) {
        int x1 = Math.max(this.x, other.x);
        int y1 = Math.max(this.y, other.y);
        int x2 = Math.min(this.x + this.width, other.x + other.width);
        int y2 = Math.min(this.y + this.height, other.y + other.height);

        if (x1 < x2 && y1 < y2) {
            return new Rectangle(x1, y1, x2 - x1, y2 - y1);
        } else {
            // No overlap, return an empty rectangle
            return new Rectangle(0, 0, 0, 0);
        }
    }

    public void display() {
        System.out.println("Rectangle [x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + "]");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for Rectangle 1:");
        System.out.print("Enter x-coordinate: ");
        int x1 = scanner.nextInt();
        System.out.print("Enter y-coordinate: ");
        int y1 = scanner.nextInt();
        System.out.print("Enter width: ");
        int width1 = scanner.nextInt();
        System.out.print("Enter height: ");
        int height1 = scanner.nextInt();

        // Get input for the second rectangle
        System.out.println("Enter details for Rectangle 2:");
        System.out.print("Enter x-coordinate: ");
        int x2 = scanner.nextInt();
        System.out.print("Enter y-coordinate: ");
        int y2 = scanner.nextInt();
        System.out.print("Enter width: ");
        int width2 = scanner.nextInt();
        System.out.print("Enter height: ");
        int height2 = scanner.nextInt();

        Rectangle r1 = new Rectangle(x1, y1, width1, height1);
        Rectangle r2 = new Rectangle(x2, y2, width2, height2);

        System.out.println("Rectangle 1:");
        r1.display();
        System.out.println("Rectangle 2:");
        r2.display();

        Rectangle r3 = r1.intersection(r2);
        System.out.println("Intersection of Rectangles:");
        r3.display();

        scanner.close();
    }
}
