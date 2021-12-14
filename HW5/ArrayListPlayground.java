package HW5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListPlayground {
    

    public static void main(String[] args) {
    // Question 1
    // Write Java statements that do the following:
    // a) Declare an arrayList nums of 15 elements of type int.
    // b) Output the value of the tenth element of the array nums.
    // c) Set the value of the 5th element of the array alpha to 99.
    // d) Set the value of the 9th element of the array alpha to the sum of the 6th and 13th elements of the array nums.

        //creating the array
        int[] nums = new int[15];
        //didn't know if you wanted us to instantiate values to the array or not besides the directions
       
        //Outputting the 10th value
        System.out.println(nums[9]);
        
        //Changing the value of fifth element
        nums[4] = 99;
        System.out.println(nums[4]);
        

        nums[8] = nums[5] + nums[12];
        System.out.println(nums[8]);
    // Question 2
    // a) create an arrayList of Strings that contain each day of the week.(starting on monday)
    // b) output each of the days of the week
    // c) output the days of the week we have class
    // d) output the days of the week that we have class 
    // e) change the arrayList to start on Sunday
        String[] daytime = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        for (String week : daytime){
            System.out.println(week);
        }
        System.out.println(daytime[1] + " " + daytime[3]); 
       

        String newweek = daytime[6] + " " +daytime[0] +" " +daytime[1] +" " +daytime[2] +" " +daytime[3] +" " +daytime[4] +" " +daytime[5];

        System.out.println(newweek);
    // Question 3 
    // a) create an ArrayList and prompt the user for numbers to add to it until the number 0 is selected
    // b) return the largest and smallest number
    // c) return the ArrayList sorted smallest to largest
    // d) take that ArrayList see if its size is divisable by 3 and then output the ArrayList in a matrix format
    // NOTE: make the matrix n X 3 so it can be n rows by 3 columns 
    // EX. ArrayList [1,2,3,4,5,6,7,8,9]
    // 1 2 3
    // 4 5 6
    // 7 8 9
    // NOTE: If the ArrayList is NOT divisable by 3 ask the user for more numbers and add them until it is
    // ArrayList Size: 7
    // Please enter 2 more numbers to create the matrix...
    // 

    ArrayList<Integer> numbers = new ArrayList<Integer>();

    Scanner kb = new Scanner(System.in);
    
    System.out.println("Enter any number:");
    System.out.println("Enter 0 to Exit!");
    int number = kb.nextInt();

    while (number != 0){
        numbers.add(number);
        System.out.println("Enter any Number:  (remember 0 to exit):");
        number = kb.nextInt();
    }

    Collections.sort(numbers);
    System.out.println(numbers);

    if(numbers.size()%3==0){
        for(int i = 0; i<numbers.size();i++)
    {
        System.out.println(numbers.get(i) + " ");
    if(((i+1)%3==0)){
        System.out.println();
        }
    }
}
    
else{
    System.out.println("Please add " +(3-(numbers.size()%3)+" more numbers"));
    for(int i = 0; i<(3-(numbers.size()%3));i++){
        System.out.println("Enter #" +(i+1)+":");
    number = kb.nextInt();
    numbers.add(number);
}
kb.close();
}
for(int i = 0;i<numbers.size();i++){
    if(i%3==0)
        System.out.println("\n");
        System.out.println(numbers.get(i) + "\t");
    }
    //I just can't get it to print a matrix
}
}