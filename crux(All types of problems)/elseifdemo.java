package crux;

import java.util.Scanner;

public class elseifdemo {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		   int p = scn.nextInt();
		   int r = scn.nextInt();
		   int t = scn.nextInt();
		   
		   float si;
		   
		   si = (p*r*t)/100;
		System.out.println("Principal entered   "  +p);
		System.out.println("Rate of interest entered   "  +r );
		System.out.println("Time period eneterd = "   +t);
		System.out.println("Simple interest is "  +si);
		
		
		if(si <= 7) {
			System.out.println("good");
		}
		else if(si >=8 && si <=12) {
			System.out.println("better");
		}
			
		
		else if(si>=13 && si<=18) {
			System.out.println("best");
		}
		else if(si>18) {
			System.out.println("legendary");
		}
		else {
			System.out.println("worst");
		}
		
		
		
		   

	}

}
