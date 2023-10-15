package lab01;

import java.util.Scanner;
 
public class SocialNW {
	static boolean isPrime(int number) {
		for(int i = 2 ; i < number; i++)
        	if(number%i == 0)
        		return false;
	   return true;
	}
	public static void main(String[] args) {
		System.out.print("Enetr the number: ");
	    Scanner input = new Scanner(System.in);  // Create a Scanner object
        int number = input.nextInt();
        if (isPrime(number))
        System.out.println(" yes is Prime"); 
        else
        	System.out.println(" Not Prime ");
	}

}
