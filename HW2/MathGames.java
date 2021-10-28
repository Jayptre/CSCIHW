import java.util.Scanner;

public class MathGames {

    public static void main(String[] args) {
        
    
    // 1. Create a method that will calculate the Pythagorean Theorem (https://en.wikipedia.org/wiki/Pythagorean_theorem)
    // c = sqrt(a^2+b^2)
    // NOTE: You can assume you will only need to calculate the Hypotenuse
    // Hint 1: Method should take in 2 sides(a and b) of the triangle and return the missing side.
    //      Remember the Triangle has a base, Perpendicular, and Hypotenuse
    // Hint 2: Math.pow and Math.sqrt are your friend here
    // Bonus points: Try to make it accept any 2 sides and return the 3rd. So it can take in
    // Hypotenuse and Perpendicular and return the base.

    //Start Pythagorean Theorem Code

        Scanner tri = new Scanner(System.in);
        double side1, side2, hypotenuse;
        System.out.println("Welcome to the Pythagorean Theorem Calculator!");
        System.out.println("Please Enter A Value For Side 1: ");
        side1 = tri.nextDouble();
        System.out.println("Please Enter A Value for Side 2: ");
        side2 = tri.nextDouble();
        hypotenuse = Math.sqrt((side1*side1)+(side2*side2));
        System.out.println("The length of the Hypotenuse is: " + hypotenuse);

        
        
    

    
    // 2. Create a method that will calcuate my grade in the class. You can use the grade range as follows
        // A: 100 - 90
        // B:  89 - 80
        // C:  79 - 70
        // D:  69 - 60
        // F:  60 -  0 
        // method should accept the grade as a double and return the letter grade of what I got
        // NOTE: Im a really nice guy and always round up on my grading so a 69.3 will round up to a 70.0
        // Hint 1: if statements are your friend here you will probably need at the least 5 if / ifelse / else statments
        // Hint 2: You will probably need to cast the double to an int
        // Hint 3: You will probably need to use the Math.ceil() method 

        //Start CSCI Grading Code

      
            Scanner gr = new Scanner(System.in);
            double grade;
            
            System.out.println("Welcome to the Grading Wizard \n Please Input the Number Grade Below");
            grade = gr.nextDouble();
            grade = Math.ceil(grade);
            if(grade<60){
                System.out.println("You received an F");
                System.out.println("You have Failed. How? Only you can answer that.");
            }
            else if(grade>=60 && grade<70){      
                System.out.println("You received a D \n No That does not stand for Detroit.");
            }
            else if(grade>=70 && grade<80){ 
                System.out.println("You Received a C \n Yes C's get Degrees but this professor literally gave you the answers.");
            }
            else if(grade>=80 && grade<90){
                System.out.println("You Received a B");
            }
            else if(grade>=90 && grade<=100){
                System.out.println("Congrats you Received an A");
            }
            else{
                System.out.println("Sorry That is Not a Valid Input");
            }
            
        
        


    // 3. Create a method that will calculate the tip on a bill
    //      Method parameters: total bill, amount of people splitting the bill, percentage to tip.
    //      Note: I would like the total always rounded up to a whole number
    //      Hint 1: percentage can be made easier to work with if you divide by 100 so 18% is 18/100 = 0.18
    //      Hint 2: Using doubles will be helpful for when you need to calculate decimals
    //      Hint 3: It is possible you might need to Cast a double to an int or vice versa
    //      Hint 4: You will probably need to use the Math.ceil() method 

    //Start Tips and Bill Calculator Code

        Scanner key = new Scanner(System.in);
        double bill, percent, tip;
        int people, total, split;
       
        System.out.println("Welcome to the Tip Calculator!");
        System.out.println("Please Enter Amount of Patrons");
            people = key.nextInt();
        System.out.println("Now, how much did everything cost?");
            bill =  key.nextDouble();
        System.out.println("And at what percent would you like to tip \nPlease enter as a decimal.");
            percent = key.nextDouble();
            tip = (bill * percent);
            total = (int) (bill + tip);
        System.out.println("The total comes to $" + total);
        split = (int) (total/people);
        System.out.println("If you split the bill it would cost \n $" + split + " each.");

        
    }


}
    

