package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
			System.out.println("Enter value for n:");
			int n = in.nextInt();
			

		boolean [] prime = new boolean[n + 1];
		for (int i = 2; i<= n; i++) {
			prime[i] = true;
			System.out.println(prime[i] + "is a prime number");
			{
			
		
			for (int p = 2; p * p <= n; p++) {
				if (prime[p]) {
					for (int multiply = p*p; multiply <=n; multiply +=p ) {
						prime[multiply] = false;
						System.out.println(prime[p] + "is a prime number");
					}
			
					
			}
			
			}
		}
	}
	}
}
	
		
		
		
		
		
		
		