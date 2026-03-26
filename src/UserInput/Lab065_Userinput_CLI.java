package UserInput;

public class Lab065_Userinput_CLI {
    public static void main(String[] args) {
        String age_String = args[0];
        System.out.println(age_String);
        int age = (Integer.parseInt(age_String));
        String canIVote =  age>=18 ? "Yes" : "No";
        System.out.println(canIVote);

    }

}
    