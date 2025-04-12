package numberPogramms;

import java.util.Scanner;

public class FibonacciSeries1 {

	public static void main(String[] args) {
		int i=1; int x=0; int y=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		System.out.print("Fibonaccis series "+n+"  terms:");
		while(i<=n) {
			System.out.print(x+" ");
			int z=x+y;
			x=y;
			y=z;
			i++;
		}
		

	}

}
