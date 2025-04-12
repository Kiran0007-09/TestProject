package numberPogramms;

import java.util.Scanner;

public class ArmStrongNum {

	public static void main(String[] args) {
		int temp,c=0;
		Scanner sc=new Scanner(System.in);
			System.out.println("Please enter number");
			int num=sc.nextInt();
			temp=num;
			int numofDigits=String.valueOf(num).length();
			System.out.println("Number of Digits in the number:"+numofDigits);
			while(num!=0) {
				int digit=num%10;
				System.out.println("Number of Digits:"+numofDigits);
				c=c+(int) (Math.pow(digit, numofDigits));
			num=num/10;
		}if(temp==c) {
			System.out.println("Given number is armstrong number");
		}else {
			System.out.println("Given number is NoT armstrong number");
		}

	}

}
