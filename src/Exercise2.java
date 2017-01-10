import java.util.Scanner;


public class Exercise2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Input the cents: ");
		int cents = reader.nextInt();
		
		int dollars = cents / 100;
		cents = cents % 100;
		
		System.out.println("That is  " + dollars + "  dollars and  " + cents + "  cents");
	}

}