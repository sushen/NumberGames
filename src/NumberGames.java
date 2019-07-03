

import java.util.Scanner;

public class NumberGames {

    public static void main(String [] args){
        int randomNumber = (int) (Math.random() * 100) + 1;
        System.out.println("I have randomly choosen a number between 1 and 100");
        System.out.println("Try To Guess It");

        for (int i = 10; i > 0 ; i--){
            System.out.println("You Have " + i + " Guess Left");
        }
    }
}
