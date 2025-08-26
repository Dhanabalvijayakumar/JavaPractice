package MyFirstExample;

import java.util.Iterator;

public class ForLoopTask {

	public static void main(String[] args) {
		
		// divisible by 2
		
//		for (int i=100; i>=50; i-=2) {
//			System.out.println(i);
//		}
		
		// divisible by 4
		
//		for (int i=100; i>=50; i-=4) {
//			System.out.println(i);
//		}
		
		// divisible by 2 & 4
		
//		for (int i=100; i>=50; i-=4) {
//			System.out.println(i);
//		}
		
		
		// right triangle
		
		for (int i=0; i<=5; i++) {
			for (int j=i; j<=5; j++) {
				System.out.print(" ");
			}
			for (int k=0; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		

	}

}
