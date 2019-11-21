import java.util.Scanner;

public class Minutes {
	public static void main(String[] args){
		// create object of scanner class.
		Scanner in = new Scanner(System.in);

		// enter the seconds here.
		System.out.print("Enter minutes: ");

		int t = in.nextInt(); 

		int hours = t / 60;
		int minutes = t % 60;

		System.out.print("There are " + hours + " hours and " + minutes + " mins.");
		System.out.print("\n");
	}  
}