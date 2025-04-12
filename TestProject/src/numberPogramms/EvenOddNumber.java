package numberPogramms;

public class EvenOddNumber {

	public static void main(String[] args) {
		int a=1;
		while(a<10) {
			if(a%2==0) {
				//System.out.println("Even numbers are"+a);
				a++;
				
				continue;
				
			}
			System.out.println("Odd numbers are"+a);
			a++;
		}

	}

}
