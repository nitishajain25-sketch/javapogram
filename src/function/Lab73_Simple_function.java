package function;

public class Lab73_Simple_function {
    
    static void printHello() {
        System.out.printHello();
        System.out.println("Hello");
    }

    static int add(int a, int b){
        return a + b;
    }
    static boolean isEven(int number){
        return number % 2 == 0;
    }


    public static void main(String[] args) {

       printHello();

       int sum = add(5,3);
       System.out.println("Sum: " + sum);

       boolean evencheck = isEven(9);
       System.out.println(" Is 9 even ? = " + evencheck);

        boolean evencheck2 = isEven(8);
        System.out.println(" Is 8 even ? = " + evencheck2);
    }
}
