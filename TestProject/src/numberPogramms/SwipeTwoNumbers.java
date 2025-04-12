package numberPogramms;

public class SwipeTwoNumbers {

	public static void main(String[] args) {
		int x=10;
		int y=20;
		System.out.println("Before Swipe"+x +y);
		int temp=x;
		x=y;
		y=temp;
		System.out.println("After swipe "+x +y);
	}

}
