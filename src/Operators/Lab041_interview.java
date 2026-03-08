package Operators;

public class Lab041_interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int balaji_salary = 12;
		boolean b = !(balaji_salary >10 ) || (balaji_salary < 5);
		System.out.println(b);
		
		// A: balaji_salary > 10  ---> 12>10 ---> true
		// B: balaji_salary < 5    --> 12<5  -----> false
		// !(A||B)	----> !(true || false)  !true  -----> falses
	}

}
