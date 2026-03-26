package UserInput;

import java.util.Scanner;

public class Lab067_userInput_Scanner_01 {
    public static void main(String[] args) {
        // Scanner class is used to take input from the user
        // It is a part of java.util package

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entr the age");
        int age = scanner.nextInt();
        String canIVote = age >=18 ? "Yes" : "No";
        System.out.println(canIVote);
        
    }
}
