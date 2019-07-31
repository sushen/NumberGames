//Input The Scanner class

import java.util.Scanner;

// Java Class
public class NumberGames{
//  Main Method
    public static void main(String args[]){

        System.out.println("This is a  Number Gassing Games!! ");
        System.out.println("You have to guess a number between 1 to 100");

//      Generate a random number between 1-100.
        int rangomNumber = (int) (Math.random()*100) +1;
        boolean hasWon = false;


//      Test The Scanner library
        Scanner scanner = new Scanner(System.in);

//      Create a loop that asks the user to guess a number.
        for (int i = 10; i > 0; i--) {
//              Read the user's input and compare it to the random number.
            System.out.println("You have " + i + " guess left." + " Enter The Number:");
            int gussNumber = scanner.nextInt();
            System.out.println("Your guess is " + gussNumber);

//              Let the user know if the guessed number was greater than or less than the random number.
            if (gussNumber > rangomNumber) {
                System.out.println("Winning Number is Smaller then your gess ");
            } else if (gussNumber < rangomNumber) {
                System.out.println("Winning Number is bigger than your gess. ");
            } else if (gussNumber == rangomNumber) {
                hasWon = true;
                break;
            }
        }

    //        If they guessed the number right end the loop and tell them they've won.
        if (hasWon){
            System.out.println("You win");
        }else {
            System.out.println("You Loss, The number you try to find is "+ rangomNumber);

        }
    //        If they used up all 10 guesses end the loop and tell them they've lost.

    }
}