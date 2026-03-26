package UserInput;

public class Assigment_largest_number {



    public static void main(String[] args) {

      // Scanner sc = new Scanner(System.in);
        int a = 10;
        int b = 20;
        int c = 30;
        
        int largest = (a >b) ? a :
        (b > c) ? b :
        (a > c) ? a : c;



    
    
       System.out.println("The number is: " + largest);
    

}
}
