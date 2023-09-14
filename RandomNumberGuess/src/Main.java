import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(101); // 0 to 100
        Scanner s = new Scanner(System.in);
        int loop=0;
        while(true)
        {
            System.out.println("Enter your guess, 0~100!");
            int guess = s.nextInt();
            if(guess>100 || guess<0)
            {
                System.out.println("Wrong guess, please stick to the limit, 0~100");
            }
            if(guess <= (0.25*randomNumber))
            {
                System.out.println("You're massively lower, try again!");
            }
            else if(guess <=(0.5*randomNumber) && guess>(0.25*randomNumber))
            {
                System.out.println("You're too lower, try again!");
            }
            else if(guess > 0.51*randomNumber && guess<(randomNumber))
            {
                System.out.println("You're lower, try again!");
            }
            else if(guess > randomNumber && guess<=randomNumber*1.25)
            {
                System.out.println("You're higher, try again!");
            }
            else if(guess > randomNumber*1.25 && guess<=randomNumber*1.5)
            {
                System.out.println("You're too higher, try again!");
            }
            else if(guess>randomNumber*1.51)
            {
                System.out.println("You're massively higher, try again!");
            }
            else if(guess==randomNumber)
            {
                System.out.println("Yaayyy!! you have guessed it right in " + loop + " trials!");
                break;
            }
            loop++;
        }
    }
}