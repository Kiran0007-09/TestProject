package numberPogramms;

import java.util.Scanner;

public class SwipeTwoWithoutThirdVar {

	public static void main(String[] args) {
		int x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("Before swipe"+x +y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After Swipe:"+x +y);
		
	}

}
