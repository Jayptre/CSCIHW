import java.util.Scanner;

public class Grading{

    public static String Grades() {
        Scanner sc = new Scanner(System.in);
        double grade;
        
        System.out.println("Welcome to the Grading Wizard \n Please Input the Number Grade Below");
        grade = sc.nextDouble();
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
        sc.close();
    
    return "Hope you enjoyed CSCI Class!";
}}
