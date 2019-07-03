

import java.util.Scanner;

public class NumberGames {

    public static void main(String [] args){
        int randomNumber = (int) (Math.random() * 100) + 1;
        boolean hasWon = false;


        System.out.println("I have randomly choosen a number between 1 and 100");
        System.out.println("Try To Guess It");

        Scanner scanner = new Scanner(System.in);

        for (int i = 10; i > 0 ; i--){
            System.out.println("You Have " + i + " Guess Left. Choose Again");
            int guess = scanner.nextInt();

            // Random Number = 15. Gess = 1, then one of the three will be true
            if (randomNumber < guess){
                System.out.println("Its smaller then " + guess + "Guess");
            }
            else if (randomNumber > guess){
                System.out.println("Its larger then " + guess + "Guess");
            }
            else {
                hasWon = true;
                break;
            }

        }
        if (hasWon){
            System.out.println("CORRECT ...... You Won!!");
        }else {
            System.out.println(" Game Over ...... You Lose!!");
            System.out.println(" The Random Number was " + randomNumber);
        }
    }
}
