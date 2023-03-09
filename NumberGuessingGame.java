
package numberguessinggame;

import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        int attempts = 5;
        int number = (int)(Math.random()*10) + 1;
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Guess the number between 1 to 10 (5 attempts left)");
        
        while(attempts>0)
        {
            int usernum = kb.nextInt();
            attempts --;
         
            if(number == usernum)
            {
                System.out.println("Congratulations!! You guessed the right number. ");
                System.out.println("Your score is: "+attempts);
                System.exit(0);
            }
            else if(number < usernum)
            {
                System.out.println("Number guessed is larger ("+attempts+" attempts left)");
                
            }
            else if(number > usernum)
            {
                System.out.println("Number guessed is smaller ("+attempts+" attempts left)");
            }
             
        }
    }
    
}
