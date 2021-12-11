package HW3;
import java.util.Scanner;

public class Loops {

    //NOTE: DO NOT change anything in the boiler plate
    //If I added default code it is meant to be there
    //and should not be adjusted unless otherwise noted
    //(return statments are usually changed)

    //Make a method that will return true if a given 
    //String contains between 1 and 3 'e' chars.
    //Ex.
    //loopE("eat") -> true
    //eeat -> true
    //eeeat -> true
    //eeeeat -> false

    public static boolean loopE(String str){
        int count = 0;

        for (int i=0; i<str.length(); i++){
            String sub= str.substring(i,i+1);
            if (sub.equals("e")) count++;
        }

        return (count>=1 && count<=3); // <- this should be changed 
    }

    //Given a String str and int n return a larger string
    //that is n copies of the original string 
    //Ex.
    //stringTimes("Code",2) ->"CodeCode"
    //stringTimes("Code",4) ->"CodeCodeCodeCode"

    //start code
    public static String stringTimes(String str, int n) {
        //create string
        String home = "work";
        //start for loop
        for (int i = 0; i < n; i++)
            home += str;
        
        return home; // <- this should be changed 
    } 

    //Create a method Given a string, return the string where all of the "z"
    //Have been removed. Except do not remove a z at the start
    //or end
    //Ex.
    //stringT("zHelloz") -> "zHelloz"
    //stringT("nozthaznks") -> "nothanks"
    //stringT("xksiazdjaasldzsajzasdz") -> "xksiadjaasldsajasdz"
    public static String stringZ(String str){

        String teststring = str.substring(0, 1);

        String newtest = str.substring(1, str.length()-1); // this sets the parameter to not replace the 1st and last characters
        teststring = teststring + newtest.replace("z", ""); // removes z's from the string except 1st and last
        return teststring;
    }

    //Create a method that contains a while loop that allows for
    //The user to input numbers until the number 0 is entered. Each time a number is 
    //entered the total will be summed and then prompted for a second number. 
    //NOTE: I require the use of scanner here to get each integer from the user
    //Assume the numbers entered are integers
    //Also note that the method is void meaning you will not need to return anything
    //It will need to sysout the numbers however
    //Below is a sample output what I would like
    // I will add up the numbers you give me....
    // Number: 12
    // The total so far is 12.
    // Number: 2
    // The total so far is 14.
    // Number: 3
    // The total so far is 17.
    // Number: 4
    // The total so far is 21.
    // Number: 1
    // The total so far is 22.
    // Number: 2
    // The total so far is 24.
    // Number: 3
    // The total so far is 27.
    // Number: 0
    // TOTAL ENDED --- The total is 27.
    public static void sums(){ 
        System.out.println("Enter a Number To Be Added:");
        System.out.println("To end enter 0");
            while(true) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int sum = 0;
        if(number == 0)
        break;
        if(number != 0 ) {
        number = input.nextInt();
        sum += number;
    }
        System.out.println("Number Entered= " + number);
        System.out.println("The Total is Now: " + sum);
}
    }

    public static void main(String[] args) {
        // Add code to help test your methods here
        
    }
    
}
