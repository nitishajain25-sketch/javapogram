package for_loop;

import java.util.Random;
import java.util.Scanner;

public class Assignment_while_numberGusseinggame {
public static void main(String[] args) {

   
    Random random = new Random();
    int usernumber = random.nextInt(10);
    
    Scanner scanner = new Scanner(System.in);
    int guessednumber;
    int count = 0;
   
    while(true)
    {
        guessednumber = scanner.nextInt();
        count++;
        

        if(guessednumber < usernumber && guessednumber > 0)
        {
            System.out.println("Too low, try again");
        }
        else if (guessednumber > usernumber) 
        {
            System.out.println("Too high, try again");
        }
        else 
            {
                System.out.println( " It took you " + count + " counts.");
                break;
            }   
    }
}
}

