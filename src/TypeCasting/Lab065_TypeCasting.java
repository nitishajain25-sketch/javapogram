package TypeCasting;

public class Lab065_TypeCasting {

    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45f;
    // int total = course + GST; // Narrow -> implicit
        int total1 = course + (int) GST; // Narrow -> Explicit
        
        System.out.println(total1);

        float total2 = course + GST; // Widening -> Implicit
        float total3 = course + (float) GST; // Widening -> Explicit
        System.out.println(total2);
        System.out.println(total3);


    }
}
