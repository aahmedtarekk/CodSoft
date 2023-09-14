import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ATM ATM = new proxyATM();
        CreditCard creditCardValid = new CreditCard(500);
        creditCardValid.setDaysTillExpiry(90);
        System.out.println("Welcome to CIB Bank, please enter your creditCard!");
        while(true)
        {
            System.out.println("Please select one of the following options!");
            System.out.println("For Withdraw, press 1!");
            System.out.println("For Deposit, press 2!");
            System.out.println("For Balance Check, press 3!");
            Scanner s = new Scanner(System.in);
            int choice = s.nextInt();
            if(choice ==1)
            {
                System.out.println("Please enter the amount of money that you would like to withdraw!");
                double Entry = s.nextInt();
                System.out.println(ATM.withdraw(creditCardValid,Entry));
            }
            else if(choice ==2)
            {
                System.out.println("Please enter the amount of money that you would like to deposit!");
                double Entry = s.nextInt();
                System.out.println(ATM.deposit(creditCardValid,Entry));
            }
            else if(choice ==3)
            {
                System.out.println(ATM.checkBalance(creditCardValid));
            }
            else
            {
                System.out.println("Wrong choice, please try again!");
                continue;
            }
            System.out.println("Would you like to do another transaction?\n Press 1 if Yes \n Press 0 if No");
            int choice1 = s.nextInt();
                if (choice1 == 1)
                    continue;
                if (choice1 ==0) {
                    System.out.println("Thanks for choosing our bank!");
                    break;
                }
            }
        }
    }
