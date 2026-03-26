package Inc_dec_operator;

public class Lab058_Exp_1 {
    public static void main(String[] args) {
        
        int a = 10;
        System.out.println(a++ + ++a);
        System.err.println(a);

         // a++ -> A -> ExpA -> 10 , a ->  11
        // +
        // ++a -> B -> ExpB -> 12 , a -> 12

        // a++ + ++a
        // 10 +12-> 22
    }

}
