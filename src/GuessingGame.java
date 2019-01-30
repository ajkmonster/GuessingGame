import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args){
        int guess;
        Scanner num =new Scanner(System.in);
        System.out.print("Please enter in a number from 1-10: ");
        guess = num.nextInt();
        Random r = new Random();
        int x = 1 + r.nextInt(10);
        while (guess != x){
            System.out.println("You guessed wrong. Please re-try."+"\n");
            System.out.print("Please enter in a number from 1-10: ");
            guess = num.nextInt();
        } if (guess == x) {
            System.out.println("Good guess! You were correct.");
        }
    }
}
