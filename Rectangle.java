import java.util.Scanner;

public class Rectangle {
    static Scanner scan = new Scanner(System.in);
    int length;
    int width;

    // Default constructor
    public Rectangle() {
        System.out.println("Enter len: ");
        length = scan.nextInt();
        System.out.println("Enter width: ");
        width = scan.nextInt();
    }

    // Constructor with one parameter
    public Rectangle(int side) {
        length = side;
        width = side;
    }

    // Constructor with two parameters
    public Rectangle(int l, int w) {
        length = l;
        width = w;
    }
   // copy constructor
    public Rectangle(Rectangle r) {
        length = r.length;
        width = r.width;
    }

    public int area() {
        return length * width;
    }

    public void display() {
        System.out.println("Length: " + length + ", Width: " + width + ", Area: " + area());
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();              // user input
        Rectangle rect2 = new Rectangle(5);             // square
        Rectangle rect3 = new Rectangle(4, 7);          // custom rectangle
        Rectangle rect4 = new Rectangle(rect3);         // copy of rect3

        System.out.println("Rectangle 1:");
        rect1.display();

        System.out.println("\nRectangle 2:");
        rect2.display();

        System.out.println("\nRectangle 3:");
        rect3.display();

        System.out.println("\nRectangle 4 (Copy of Rectangle 3):");
        rect4.display();
    }
}
