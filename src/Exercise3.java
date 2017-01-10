import java.util.Scanner;


public class Exercise3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Input the change due in cents: ");
		int cents = reader.nextInt();
		
		int dollars = cents / 100;
		cents = cents - (dollars * 100);
		int quaters = cents / 25;
		cents = cents - (quaters * 25);
		int dimes = cents / 10;
		cents = cents - (dimes * 10);
		int nickles = cents / 5;
		cents = cents - (nickles * 5);
		
		System.out.println("Your change is:  " + dollars + "  dollars,  " + quaters + "  quaters,  " + dimes + "  dimes,  " + nickles + "  nickles, and  " + cents + "  cents");
	}

}