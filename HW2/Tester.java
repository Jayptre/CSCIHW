import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bill, percent, tip;
        int people, total, split;
       
        System.out.println("Welcome to the Tip Calculator!");
        System.out.println("Please Enter Amount of Patrons");
            people = sc.nextInt();
        System.out.println("Now, how much did everything cost?");
            bill =  sc.nextDouble();
        System.out.println("And at what percent would you like to tip \nPlease enter as a decimal.");
            percent = sc.nextDouble();
            tip = (bill * percent);
            total = (int) (bill + tip);
        System.out.println("The total comes to $" + total);
        split = (int) (total/people);
        System.out.println("If you split the bill it would cost \n $" + split + " each.");
    }
    
}
