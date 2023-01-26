package studio1;
import java.util.Scanner;

public class Average2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("The average between two integers");
		System.out.println("Value of first integer?");
		int n1 = in.nextInt();
		System.out.println("Value of second integer?");
		int n2 = in.nextInt();
		System.out.println("Average of " + n1 + " and " + n2 + " is " + (n1+n2)/2.0);
	}

}
