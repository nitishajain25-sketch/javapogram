package TypeCasting;

public class lab064_Typecasting {
    public static void main(String[] args) {
        long phone = 123456789L;
        // short s = phone; // Narrowing -> Implicit Casting is not allowed
    }     short s1 = (short) phone; // Narrowing -> Explicit Casting
        
}
