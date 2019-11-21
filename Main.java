import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Area Calculator! \nEnter 1 to find the area of a Rectangle \nEnter 2 to find the area of a Square \nEnter 3 to find the area of a Triangle \nEnter 4 to find the area of a Circle");

        int userInput = Integer.parseInt(scanner.next());

        if(userInput == 1) {
            System.out.println("Please enter the length of the rectangle: ");
            int length = Integer.parseInt(scanner.next());
            System.out.println("Please enter the width of the rectangle: ");
            int width = Integer.parseInt(scanner.next());

            System.out.println(length * width);
        } else if(userInput == 2) {
            System.out.println("Please enter the length of a side: ");
            int lengthOfASide = Integer.parseInt(scanner.next());

            System.out.println(lengthOfASide * lengthOfASide);
        } else if(userInput == 3) {
            System.out.println("Please enter the base of the triangle: ");
            int triangleBase = Integer.parseInt(scanner.next());
            System.out.println("Please enter the height of the triangle: ");
            int triangleHeight = Integer.parseInt(scanner.next());

            System.out.println((0.5 * triangleBase) * triangleHeight);
        } else if(userInput == 4) {
            System.out.println("Please enter the radius of the circle: ");
            int radius = Integer.parseInt(scanner.next());
            DecimalFormat df = new DecimalFormat("0.00");
            System.out.println(df.format(Math.PI * (radius * radius)));
        }
    }
}