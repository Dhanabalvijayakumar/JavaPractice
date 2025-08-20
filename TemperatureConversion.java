package MyFirstExample;

import java.util.Scanner;
	
public class TemperatureConversion {
	
	public static double CelsiusToFahrenhit(double celsius) {
		return (celsius * 9/5) + 32;
	}
	
	public static double CelsiusToKelvin(double celsius) {
		return celsius + 273.5;
	}
	
	public static double FahrenhitToCelsius(double fahrenhit) {
		return (fahrenhit - 32) * 5/9;
	}
	
	public static double FahrenhitToKelvin(double fahrenhit) {
		return (fahrenhit - 32) * 5/9 + 273.5;
	}
	
	public static double KelvinToCelsius(double kelvin) {
		return kelvin - 273.5;
	}
	
	public static double KelvinToFahrenhit(double kelvin) {
		return (kelvin - 273.5) * 9/5 + 32;
	}
	
	public static void main(String[] args) {
		
		Scanner temp = new Scanner(System.in);
		
		System.out.println("Enter the temperature option");
		System.out.println("1.Celsius");
		System.out.println("2.Fahrenhit");
		System.out.println("3.Kelvin");
		
		int input = temp.nextInt();
		
//		double celsius = 25.0;
//		double fahrenhit = 77.0;
//		double kelvin = 298.15;
		
		switch(input) {
		case 1: {
			System.out.println("Enter the temperature in Celsius");
			double celsius = temp.nextDouble();
			System.out.println("Celsius to Fahrenhit "+CelsiusToFahrenhit(celsius));
			System.out.println("Celsius to Kelvin "+CelsiusToKelvin(celsius));
			break;
		}
		case 2: {
			System.out.println("Enter the temperature in Fahrenhit");
			double fahrenhit = temp.nextDouble();
			System.out.println("Fahrenhit to Celsius "+FahrenhitToCelsius(fahrenhit));
			System.out.println("Fahrenhit to Kelvin "+FahrenhitToKelvin(fahrenhit));
			break;
		}
		case 3: {
			System.out.println("Enter the temperature in Kelvin");
			double kelvin = temp.nextDouble();
			System.out.println("Kelvin to Celsius "+KelvinToCelsius(kelvin));
			System.out.println("Kelvin to Fahrenhit "+KelvinToFahrenhit(kelvin));
			break;
		}
		default: {
			System.out.println("Enter the correct option !!!");
			break;
		}
		
		}
		
		temp.close();
		
	}

}
