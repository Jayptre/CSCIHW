package HW1;
//Adlibs HW for Jaime Petrykiewicz
//Last Modified on 18SEP2021

import java.util.Scanner;

public class Adlib
{
    public static String Input() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please State Your Name ");

        String name = sc.nextLine();
        System.out.println(name.replace ("Greg" , "Hello, Professor" ));
        System.out.println("Please State Your Age, Sure You Can Lie");

        String age = sc.nextLine();

        System.out.println("And last but not least your favorite color, Please");

        String color = sc.nextLine();

        System.out.print("In the land of Stockton " + name + " reigned supreme. ");
        System.out.println("At only " + age + " they were already an expert of their craft.");
        System.out.println("Their true power lied in the color " + color + ".");
        System.out.println("It was able to give them untold riches.");
        System.out.println("But little did they know that one day it would all be gone.");
        System.out.print("For they could not foresee the coming of the shadow. ");
        System.out.println("When the shadow came it darkened all colors.");
        System.out.println("In a world with no color " + name + " no longer had any power.");
        System.out.println("The End. Or is it...");

        sc.close();
        return "Thanks for reading!";
    }

}