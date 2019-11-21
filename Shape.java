import java.util.Scanner;
import java.lang.System;
import java.text.DecimalFormat;

public class Shape{
	public static void main(String [] args){	
		Scanner scan = new Scanner(System.in);
		
		DecimalFormat df= new DecimalFormat("0.00");
		char choice;
		char shape;
		double r,s,h,w,b,a,pi = Math.PI;
		
		do{
			System.out.println("\n\nChoose shape you want to compute the area:\n\nC for Circle\nS for Square\nR for Rectangle\nT for Triangle");
			shape = scan.next().charAt(0);
			switch(shape){
				case 'C':
				case 'c':
					System.out.print("Enter radius:");
					r = scan.nextDouble();
					a = pi*r*r;
					System.out.println("Area of the Circle is: "+df.format(a));
					break;
				case 'S':
				case 's':
					System.out.print("Enter side:");
					s = scan.nextDouble();
					a = s*s;
					System.out.println("Area of the Square is: "+df.format(a));
					break;
				case 'R':
				case 'r':
					System.out.print("Enter height:");
					h = scan.nextDouble();
					System.out.print("Enter width:");
					w = scan.nextDouble();
					a = h*w;
					System.out.println("Area of the Rectangle is: "+df.format(a));
					break;
				case 'T':
				case 't':
					System.out.print("Enter height:");
					h = scan.nextDouble();
					System.out.print("Enter base:");
					b = scan.nextDouble();
					a = (h*b)/2;
					System.out.println("Area of the Triangle is: "+df.format(a));
					break;
				default:
					System.out.println("Invalid Input!");		
			}
			System.out.println("Try Again? Yes/No");
			choice = scan.next().charAt(0);        
		}while (choice == 'y' || choice == 'Y');
	
	}	
}	
	
