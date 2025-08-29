package MyFirstExample;

public class TaskCalculator {

	public int add (int x, int y) {
		int add = x+y;
		return add;
	}
	
	public int sub (int x, int y) {
		int sub = x-y;
		return sub;
	}
	
	public int mul (int x, int y) {
		int mul = x*y;
		return mul;
	}
	
	public int div (int x, int y) {
		int div = x/y;
		return div;
	}
	
	public static void main(String[] args) {
		int a = 20, b = 5;
		TaskCalculator calc = new TaskCalculator();
		System.out.println(calc.add(a, b));
		System.out.println(calc.sub(a, b));
		System.out.println(calc.mul(a, b));
		System.out.println(calc.div(a, b));

	}

}
