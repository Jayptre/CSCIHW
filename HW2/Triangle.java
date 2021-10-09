import java.util.Scanner;

public class Triangle {

    public static String Pythagorean() {

        Scanner sc = new Scanner(System.in);
        double side1, side2, hypotenuse;
        System.out.println("Welcome to the Pythagorean Theorem Calculator!");
        System.out.println("Please Enter A Value For Side 1: ");
        side1 = sc.nextDouble();
        System.out.println("Please Enter A Value for Side 2: ");
        side2 = sc.nextDouble();
        hypotenuse = Math.sqrt((side1*side1)+(side2*side2));
        System.out.println("The length of the Hypotenuse is: " + hypotenuse);

        sc.close();
        return "Quick Maths";
    }
    
}
