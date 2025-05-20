import java.util.Scanner;


abstract class Shape {
    abstract void area();  
}

class Rectangle extends Shape {
    int length, width;

    Rectangle(int l, int w) {
        this.length = l;
        this.width = w;
    }

    void area() {
        System.out.println("Area of Rectangle: " + (length * width));
    }
}

class Square extends Shape {
    int side;

    Square(int s) {
        this.side = s;
    }

    void area() {
        System.out.println("Area of Square: " + (side * side));
    }
}

public class Ques5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter length of rectangle: ");
        int l = scan.nextInt();
        System.out.print("Enter width of rectangle: ");
        int w = scan.nextInt();

        Shape rect = new Rectangle(l, w); 
        rect.area();

        System.out.print("Enter side of square: ");
        int s = scan.nextInt();

        Shape sq = new Square(s);  
        sq.area();

    }
}
