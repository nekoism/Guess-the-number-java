package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        while(true){
            int number = (int)Math.round(Math.random()*10);;
            System.out.println("guess the number (1-10) || enter 0 to exit");
            boolean game = true;
            while(game) {
                int guessNumber = input.nextInt();
                if (number == guessNumber) {
                    System.out.println("You got it");
                    number = (int)Math.round(Math.random()*10);
                    System.out.println("guess the number (1-10) || enter 0 to exit");
                }else if(number == 0)
                    game = false;
                else{
                    System.out.println("Guess Again");
                }
            }
        }
    }
}
