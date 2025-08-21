package MyFirstExample;

public class Casting {

	public static void main(String[] args) {
		int myInt = 8;
		double myDouble = myInt;
		System.out.println("Value of myInt is "+myInt);
		System.out.println("Value of myDouble is "+myDouble);
		
		double myDouble2 = 7.78d;
		int myInt2 = (int)myDouble2;
		System.out.println("Value of myInt2 is "+myInt2);
		System.out.println("Value of myDouble2 is "+myDouble2);

	}

}
