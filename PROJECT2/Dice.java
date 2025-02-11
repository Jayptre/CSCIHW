package PROJECT2;

import java.util.Random;
import java.util.Scanner;

// Write a program that will generate a selected amount of Dice and toss them into an array.
// For example:
// 10 Dice
// 2 1 2 4 5 6 2 1 3 4
// After collecting the rolls mark off how many times the same number is rolled
// The example above has none.
// Example with a run and same numbers:
// 2 1 1 1 4 5 3 4 5 6
// Mark in paraenthese the runs that have the same number.
// Final Example:
//  2 (1 1 1) 4 5 3 4 5 6
// Note you only need to mark the first group of the same number so for this example:
// 2 (1 1 1) 4 5 5 5 3 6
// You only need to mark off the group of 1's not the group of 5's
// However if you do mark them off that is fine too
// An example with every group marked off would be:
// 2 (1 1 1) 4 (5 5 5) 3 6
// Again Marking each group is optional. The only thing I require is the first group to be marked.
// 2 (1 1 1) 4 5 5 5 3 6

// Hint 1: I have given you some code to get started but you will need to fill in the rest. A die has 6 sides.
// Hint 2: You will want to make int array to hold the values
// Hint 3: You might find it helpful to create running tally variables such as:
//         longestLength , currentLength , longestLengthIndex , currentLengthIndex, currentNum
//         This will help you keep track of runs when they occur
// Hint 4: To print the output you might want to use a for loop and loop through each index and use the variables above to 
//         Denote if you should insert a "(" or ")"


// My hints are related to the way I completed the code but there are many ways to do it! 


public class Dice {
    Random generator = new Random();
    Scanner keyboard = new Scanner(System.in);
    int sides;
    int d;
    public void DiceCount() {
        int sides = 6;

    }
    //create dice roll generator
    public int rollTide(){
        
        return (int) (Math.random() * 6 + 1);
    }

    //immplement a ton of array coding
    public static void main(String[] args) {
        Dice die = new Dice();
        die.DiceCount();
        System.out.println("How many dice would you like to roll?");
        
        //trying to create the initial array
        int d =  die.keyboard.nextInt();
        int[] array = new int[d];
        
        //creating parameters to hold values for arrays
        for (int i = 0; i < d; i++){
            array[i] = die.rollTide();
        }
        boolean rolled1 = false;
        boolean rolled2 = false;
        String diceroll = " ";
        int i = 0;
        for (i = 0; i < d - 1; i++ ){
            if( array[i] == array[i + 1]){
                if(!rolled1){
                    diceroll +="(" + array[i] + " ";
                    rolled1 = true;
                }
                else{
                    diceroll += array[i] + " ";
                }
                {
                    if (!rolled2 && rolled1){
                        diceroll += array[i] + ")";
                    }
                    else{
                        diceroll += array[i] + " ";
                    }
                }
            }
                if(array[i] == array[i]){
                    if(!rolled2 && rolled1){
                        diceroll += array[i] +")";
                    }
                    else{
                        diceroll += array[i];
                    }}
                    else{
                        if(!rolled2 && rolled1){
                            diceroll += ")" + array[i];
                    }
                    else{
                        diceroll += array[i];
                    }
                }
        }
        System.out.println(diceroll);
        
    }
}
