package gas_mileage;

import java.util.Scanner;

public class GasMileage {

	public static void main(String[] args) {
		
		Scanner kbInput = new Scanner(System.in);
		
		System.out.print("Please enter number of gallons of gas consumed: ");
		double galsGas = kbInput.nextDouble();
		System.out.println("You entered " + galsGas +" gallons of gas.");
		System.out.println();
		
		System.out.print("Please enter miles traveled: ");
		double miles = kbInput.nextDouble();
		System.out.println("You entered " + miles +" miles.");
		System.out.println();
		
		double milesPerGal = miles / galsGas;
		System.out.printf("Your vehicle is getting %.2f", milesPerGal); // formatted to two decimals
		System.out.println(" miles to the gallon.");
		
		kbInput.close();
	}
	

}
