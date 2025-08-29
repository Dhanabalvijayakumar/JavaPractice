package MyFirstExample;

public class TaskDivisibleBy12 {
	
	public boolean isDivisibleBy12 (int x) {
		if (x%12 == 0) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		int a = 24;
		TaskDivisibleBy12 obj = new TaskDivisibleBy12();
		System.out.println(obj.isDivisibleBy12(a));
	}

}
