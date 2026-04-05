package for_loop;
import java.util.Scanner;

public class Assignment_program {

    public static void main(String[] args) 
    {
    System.out.println("Enter the age:");
    Scanner scanner = new Scanner(System.in);
    int age = scanner.nextInt();
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