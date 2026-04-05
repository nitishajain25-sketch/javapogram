package for_loop;

import java.util.Scanner;

public class Assignment_age_compare {
    public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first age:");

        int age = scanner.nextInt();
        for(int i=0; i<age; i++) // Outer loop
        {
            if(age<15)
            {
                System.out.println("She will get a Candy");
            }
            else if(age>=15 && age<18)
            {
                System.out.println("She will get a Iphone");
            }
            else
            {
                System.out.println("She will get a Laptop");
            }   
        }
     }
    }
