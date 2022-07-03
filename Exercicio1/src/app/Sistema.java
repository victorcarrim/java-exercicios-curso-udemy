package app;

import java.util.Scanner;

import entities.Rectangle;

public class Sistema {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		double width = sc.nextDouble();
		rectangle.setWidth(width);
		double height = sc.nextDouble();
		rectangle.setHieght(height);
		
		System.out.println("AREA = " + rectangle.area());
		System.out.println("PERIMETER = " + rectangle.perimeter());
		System.out.println("DIAGONAL = " + rectangle.diagonal());
		
		sc.close();
	}
}
