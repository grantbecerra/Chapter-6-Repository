package exercises;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sideA, sideB, sideC;
		
		Scanner input = new Scanner(System.in);
		String chooseSideString = null;
				
		System.out.print("trying to solve a right trangle Eh?  \nPlease enter which side you are solving for>>> A\nB\nC ");
		chooseSideString = input.nextLine();
		
		if(chooseSideString.equalsIgnoreCase("A"));
		{
			System.out.println("Please enter side B"); 
			sideB = input.nextDouble();
			System.out.println("Please enter side C");
			sideC = input.nextDouble();
			
			sideA = Math.sqrt(sideC) - Math.sqrt(sideB);
			
			System.out.println("Side A is " + sideA);
		}

		
}
}