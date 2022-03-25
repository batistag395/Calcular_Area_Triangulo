package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int z = 1;
		
		while (z != 0) {
			Triangle x, y;
			x = new Triangle();
			y = new Triangle();
			
			System.out.print("Write the measures of triangle X: ");
			x.a = sc.nextDouble();
			x.b = sc.nextDouble();
			x.c = sc.nextDouble();
			
			System.out.print("Enter the measures of tringle Y: ");
			
			y.a = sc.nextDouble();
			y.b = sc.nextDouble();
			y.c = sc.nextDouble();
			
			double areaX = x.area();
			double areaY = y.area();
			
			System.out.printf("Area triangle X: %.2f%n", areaX);
			System.out.printf("Area triangle Y: %.2f%n", areaY);
			
			if (areaX > areaY){
				System.out.printf("Larger triangle X - Area: %.2f%n", areaX);
			}
			else {
				System.out.printf("Larger triangle Y - area: %.2f%n", areaY);
			}
		}
		 
		sc.close();
	}

}
