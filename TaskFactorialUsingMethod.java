package MyFirstExample;

public class TaskFactorialUsingMethod {
	
	public int factorial (int x) {
		int fact = 1, i=1;
		while (i<=x) {
			fact = fact * i;
			i++;
		}
		return fact;
	}

	public static void main(String[] args) {
		int a = 3;
		TaskFactorialUsingMethod obj = new TaskFactorialUsingMethod();
		System.out.println(obj.factorial(a));

	}

}
