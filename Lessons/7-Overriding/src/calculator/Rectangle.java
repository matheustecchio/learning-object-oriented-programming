package calculator;

import java.util.Scanner;

public class Rectangle extends GeometricFigure{
	
    Scanner s = new Scanner(System.in);
	
    // Override method
	public void calculate() {
		System.out.println("Rectancle Calculator");
		System.out.println("Enter the value of the base: ");
	    setBase(s.nextDouble());
	    
	    System.out.println("Enter the value of the height: ");
	    setHeight(s.nextDouble());
	    
		super.setArea(getBase() * getHeight());
		System.out.println("The value of area is: "+getArea());
		System.out.println("");
	}

}
