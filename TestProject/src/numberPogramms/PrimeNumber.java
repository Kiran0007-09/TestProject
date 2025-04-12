package numberPogramms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("PLease enter number");
		int num=sc.nextInt();
		Boolean isPrime=true;
		 if (num <= 1) {
	            isPrime = false; // Numbers less than or equal to 1 are not prime
	        } else {
		for(int i=2;i<=Math.sqrt(num);i++) {
			if((num%i==0)) {
				isPrime=false;
				break;
			}
		}
		if(isPrime) {
			System.out.println("Given number is prime number");
		}else {
			System.out.println("Given Number is Not Prime Number");
		}
		

	}

	}}
