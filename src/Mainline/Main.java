package Mainline;

import Shapes.Quad;
import Shapes.Quadc;
import Shapes.Rect;
import Shapes.Rectc;
import Shapes.Sqr;
import Shapes.Sqrc;

public class Main {

	public static void main(String[] args) {
	int s1=2;
	int s2=3;
	int s3=4;
	int s4=5;
	
	Quad quad1= new Quad(s1,s2,s3,s4);
	System.out.printf("perimeter of quad1: %d\n", quad1.Perimeter());
	
	
	Rect rect1 = new Rect(s1,s2);
	System.out.printf("Perimeter of rect 1: %d\n", rect1.Perimeter());
	System.out.printf("Area of rect 1: %d\n", rect1.Area());
	
	Sqr sqr1= new Sqr(s1);
	System.out.printf("Perimeter of sqr 1: %d\n", sqr1.Perimeter());
	System.out.printf("Area of sqr 1: %d\n", sqr1.Area());
	
	Quadc quad2= new Quadc(s1,s2,s3,s4);
	System.out.printf("perimeter of quad 2: %d\n", quad1.Perimeter());
	
	
	Rectc rect2 = new Rectc(s1,s2);
	System.out.printf("Perimeter of rect 2: %d\n", rect1.Perimeter());
	System.out.printf("Area of rect 2: %d\n", rect1.Area());
	
	Sqrc sqr2= new Sqrc(s1);
	System.out.printf("Perimeter of sqr 2: %d\n", sqr1.Perimeter());
	System.out.printf("Area of sqr 2: %d\n", sqr1.Area());
	}

}
