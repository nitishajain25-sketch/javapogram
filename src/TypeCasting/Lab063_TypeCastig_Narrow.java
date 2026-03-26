package TypeCasting;

public class Lab063_TypeCastig_Narrow {

    public static void main(String[] args) {
        int val = 300;
        byte b = (byte) val; // Narrowing -> Explicit Casting
        byte b1 = (byte) val; // Narrowing (int -> byte) Explicit Casting is not allowed 
        // Data Loss
        System.out.println(b1);   
    }
}
