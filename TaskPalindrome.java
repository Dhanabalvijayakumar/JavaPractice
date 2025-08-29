package MyFirstExample;

public class TaskPalindrome {
	
	public boolean isPalindrome(String s) {
		String s1 = s.toLowerCase();
		String reversed = "";
		for (int i=s1.length()-1; i>=0; i--) {
			reversed += s1.charAt(i);
		}
		return s1.equals(reversed);
		
//		return s1.equalsIgnoreCase(reversed);
	}
	
	public boolean isPalindrome(int n) {
		int temp = n;
		int rev = 0;
		
		while (n!=0) {
			int digit = n%10;
			rev = rev*10 + digit;
			n /= 10 ;
		}
		return temp == rev;
	}

	public static void main(String[] args) {
		int num = 77;
		TaskPalindrome obj = new TaskPalindrome();
		System.out.println(obj.isPalindrome(num));
		
		String ex = "Mam";
		TaskPalindrome obj1 = new TaskPalindrome();
		System.out.println(obj1.isPalindrome(ex));

	}

}
