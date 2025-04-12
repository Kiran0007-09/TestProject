package numberPogramms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number");
		int terms=sc.nextInt();
		System.out.println("Fibonacci sequence..");
		int a=0;
		int b=1;
		int c;
		if (terms >= 1) {
            System.out.print(a + " ");  // First term
        }
        
        if (terms >= 2) {
            System.out.print(b + " ");  // Second term
        }
		for(int i=3;i<=terms;i++) {
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			
			
		}
	}

}
