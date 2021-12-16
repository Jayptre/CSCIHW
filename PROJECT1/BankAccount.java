package PROJECT1;


import java.util.Scanner;

public class BankAccount {
    private double balance;

    public BankAccount(){
        balance = 0;
    }

    public BankAccount(double initalBalance) {
        balance = initalBalance;
    }

    public void deposit(double amount){
        balance = balance + amount;
        
    }
    public void withdraw(double amount){
        balance = balance - amount;
    }
    public double getBalance(){
        return balance;
    }
    public void monthlyFee(){
        withdraw(10);
    }
    // P (1 + R/n)^(nt) - P
    // P = principal
    // t = years
    // r = annual interest rate
    // n = # of times its compounded
    // PEMDAS
    public void calcInterest(double p, int t, double r, int n){
        double amount = p * Math.pow(1 + (r / n), n*t);
        double compinterest = amount - p;
        System.out.println("Compound Interest after "+ t + " years: "+ compinterest);
        System.out.println("Amount after "+ t + " years: "+ amount);
    }

    public void calcsimpInterest(double p, int t, double r){
        double simpleInterest = (p * t * r)/ 100;
        double amount = simpleInterest + p;
        System.out.println("Interest after " + t + " years: " + simpleInterest);
        System.out.println("Amount after " + t + " years: " + amount);
    }

    public void overdraftFee(double amount){
        Scanner kb = new Scanner(System.in);
        double x = balance;
        if(x==0 || x< amount){
            System.out.println("Your Balance will be Below 0$ This will incur a 35$ fee. \n Press 1 to Proceed or 0 to cancel withdrawal.");
            int a = kb.nextInt();
            if(a == 1){
                withdraw(35);
            }
            else if(a == 0){
                withdraw(0);
            }
            else{
                withdraw(0);
            }
            kb.close();
        }
    }
    public void investment(double balance, double r, double targetBalance){
        int year = 0; 
        while(balance<= targetBalance){
            year++;
            double interest = balance * r / 100;
            balance = balance + interest;
        }
        System.out.println("Total Balance: $"+ balance);
        System.out.println("Investment doubled After "+ year + " years.");
    }

    public void savingsAccount(){
        System.out.println("Welcome to the Savings Account Menu: \n Please Choose from the following options: \n 1: Begin a Savings Account.\n 2: Exit Savings Account Menu.");
        Scanner kb = new Scanner(System.in);
        int x = kb.nextInt();
        BankAccount Savingsaccount = new BankAccount(1000);
        if(x==1){
            System.out.println("Please Enter the amount you would like to deposit, Min. Amount is 1000$ ");
            System.out.println("Starting Balance: \n" + Savingsaccount.getBalance());
            System.out.println("If you would like to make an additional deposit please press 1.");
            
            int a = kb.nextInt();
            if(a==1){
                System.out.println("Please enter the additional amount you would like to deposit:");
                double Amount = kb.nextDouble();
                Savingsaccount.deposit(Amount);
                System.out.println("Your New balance is: " + Savingsaccount.getBalance());
            }
                System.out.println("Now please choose the Interest type.");
                System.out.println("Please press 1 for Simple Interest of 0.001%");
                System.out.println("Please press 2 for Compound interest rate of 0.0001%");
                    int b = kb.nextInt();
                    if (b== 1){
                        System.out.println("Enter the amount of time you would like to hold your savings.");
                        int time = kb.nextInt();
                    }
                    Savingsaccount.calcsimpInterest(Savingsaccount.getBalance(), 2, 0.001, (12/4));
                }
        else if(x==2){
            System.out.println("Thank you enjoy your day.");
        }
    
    }

    public static int menu() {
        
        int selection;
        Scanner input = new Scanner(System.in);

        /*******************************************/
        System.out.println("Please select an option:");
        System.out.println("------------------------\n");
        System.out.println("1: Get Balance");
        System.out.println("2: Deposit");
        System.out.println("3: Withdraw");
        System.out.println("4: Transfer");
        System.out.println("5: Start Savings Account");
        System.out.println("0: Quit");
        System.out.println("------------------------\n");

        selection = input.nextInt();

        System.out.println(selection);
        while(selection !=0){
            if(selection< 1 || selection> 3){
                System.out.println("Select \"1\", \"2\", or \"3\"");
                selection = input.nextInt();
            }
            else if(selection == 1){
                String balance;
            }
            else if(selection == 2){
                String deposit;
            }
            else if(selection == 3){
                String withdraw;
            }
            else if( selection == 4){
                String 
            }
            
            break;
            }
        
        return selection;
    }
    }





