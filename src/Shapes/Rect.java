package Shapes;

public class Rect extends Quad {
	
	public int Area() {
		return side1*side2;
	}
	
	public Rect() { super();}
	
	public Rect(int s1, int s2) {
		
		super(s1,s2,s1,s2);}

}
