package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner in = new Scanner(System.in);	
	System.out.println("Choose a number for prime analysis");
	int n = in.nextInt();
	boolean primeNumber [] =new boolean [n];
	for (int i=1; i<=n; i++)
	{
	if (primeNumber[i] == true)
			{
		
		System.out.println("Is prime");
		int PrimeNumber=i+1;
		for (int k = 2; k<=n; k++) {
			k = (int) (Math.pow(PrimeNumber,2)+PrimeNumber);
			primeNumber [k]= false;
		}
		
			}
			
	}

	}
}
