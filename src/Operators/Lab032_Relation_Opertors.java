package Operators;

public class Lab032_Relation_Opertors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// < Less Than
				// < =  -> Less than or equal to
				// > Greater
				// > = Greater or equal
				// == ->  Equal to (but checking)
				// != -> Not equal
		
		int a = 10;
		int b = 20;
		boolean c = a > b; // 10 > 20
		System.out.println(c);
		
		int age_rahul = 35;
		int agr_karan = 36;
		boolean result = age_rahul >= agr_karan;
		System.out.println(result);
		
		boolean compare = age_rahul == agr_karan;
		System.out.println("compare" +compare);

		// age_karan > age_rahul or age_karan = age_rahul
				// true                  or   false
		
	}

}
