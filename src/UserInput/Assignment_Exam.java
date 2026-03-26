
package UserInput;

import java.util.Scanner;

public class Assignment_Exam {

    public static void main(String[] args) {
        
    System.out.println("Enter the Student Name");
    Scanner scanner = new Scanner(System.in); 
    String s = scanner.next();
    // System.out.println(“Enter Name:” +s);
 
System.out.println("Enter the 4 Subjects");
System.out.println("Enter the Marks of  Math");
 int Math = scanner.nextInt(); 



System.out.println("Enter the  Marks of  Database");
 int Database = scanner.nextInt(); 
System.out.println("Database: " + Database); 


System.out.println("Enter the  Marks of  Computer Fundamental");
 int Computer_Fundamental = scanner.nextInt(); 
System.out.println("Computer Fundamental: " + Computer_Fundamental);

System.out.println("Enter the  Marks of  Computer Graphics");
 int Computer_Graphics = scanner.nextInt(); 
System.out.println("Computer Graphics: " + Computer_Graphics);

int int_sum = Math +Database+Computer_Fundamental+Computer_Graphics;
System.out.println("Total Marks: " + int_sum);

Double Double_Average = (double)(int_sum)/4;
System.out.println("Average: " + Double_Average);

String Grade = (Double_Average > 100) ? "Grade A+" : 
		 (Double_Average > 89) ? "Grade A" :
		 (Double_Average > 74) ? "Grade B" :
		 (Double_Average > 59) ? "Grade C" : "Fail";
		
        System.out.println("Grade: " + Grade);

    }
}