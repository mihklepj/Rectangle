import java.util.Scanner;
import java.util.Random;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

class Rectangle {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int rand;
        do {
            rand = random.nextInt(11);
        } while (rand == 0);

        System.out.print("Enter the length of Rectangle: ");
        double length = scanner.nextDouble();

        double width = rand;

        double diagonal = sqrt(pow(length,2)+pow(width,2));

        // Area = length*width;
        double area = length*width;
        double perimeter = 2*(length+width);
        System.out.printf("""
                Width of the rectangle is %.0f,
                diagonal of the rectangle is %.1f,
                area of the rectangle is %.0f and
                perimeter of the rectangle is %.0f
                """, width, diagonal, area, perimeter);
    }
}