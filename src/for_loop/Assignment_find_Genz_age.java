package for_loop;

import java.util.Scanner;

public class Assignment_find_Genz_age {

    public static void main(String[] args)
    { 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entr the age");
        int age = scanner.nextInt();
        
        
        if(age>=14 && age<=29)
        {
            System.out.println("You are a Gen z person");
        
        }
        else {
                System.out.println("You are not a Gen z person");
        }
	
        
}

}
