import java.util.Scanner;


public class Exercise1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Input the radius: ");
		int n = reader.nextInt();
		
		double area = n * n * Math.PI;
		
		System.out.println("The raduis is:" + n + "  The area is:" + area);
	}

}
