package numberPogramms;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int originalNum=num;
		int revNum=0;
		while(num!=0) {
			int digit=num%10;
			revNum=revNum*10+digit;
			num=num/10;
			
		}
		if(originalNum==revNum) {
			System.out.println("Given Number is Palindrome");
		}else {
			System.out.println("Given Number is Not Palindome");
		}

	}

}
