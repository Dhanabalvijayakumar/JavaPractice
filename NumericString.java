package MyFirstExample;

import java.util.Scanner;

public class NumericString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a numeric string");
		String input = sc.nextLine();
		
		int intValue = Integer.parseInt(input);
		long longValue = Long.parseLong(input);
		float floatValue = Float.parseFloat(input);
		double doubleValue = Double.parseDouble(input);
		
		System.out.println("Integer Value "+intValue);
		System.out.println("Long Value "+longValue);
		System.out.println("Float Value "+floatValue);
		System.out.println("Double Value "+doubleValue);

		sc.close();
	}

}
