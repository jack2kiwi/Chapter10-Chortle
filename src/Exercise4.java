import java.util.Scanner;


public class Exercise4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Input the voltage: ");
		int volts = reader.nextInt();
		System.out.println("Input the resistance: ");
		int resistance = reader.nextInt();
		
		double current = (volts + 0.0) / resistance;
		
		System.out.println("The raduis is:  " + current + "  amps");
	}

}
