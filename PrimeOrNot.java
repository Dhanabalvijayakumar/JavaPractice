package MyFirstExample;

public class PrimeOrNot {

	public static void main(String[] args) {
		int num = 11;
		boolean isPrime = true;
		
		if (num == 1) {
			isPrime = false;
		}
		else {
			int i = 2;
			while (i <= num/2) {
				if(num % i ==0) {
					isPrime = false;
					break;
				}
				i++;
			}
		}
		
		if (isPrime) {
			System.out.println("Prime number");
		}
		else {
			System.out.println("Not a prime number");
		}
	}

}
