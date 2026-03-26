package UserInput;

import java.util.Scanner;

public class Lab068_UserInput_Scanner_2 {

    public static void main(String[] args) {

        System.out.println("Enter the String: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println("The String is: " + s);

        System.out.println("Enter the Integer: ");
        int int_integer = scanner.nextInt();
        System.out.println("The Integer is: " + int_integer);

        System.out.println("Enter the Double:");
        double double_input = scanner.nextDouble();
        System.out.println(double_input);

    }
    }
   
