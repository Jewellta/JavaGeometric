package Shapes;

public class Rectc {
	
private Quadc quad;

public int Perimeter() {
	int p = quad.Perimeter();
	return p;
	
}

public int Area() {return(quad.side1*quad.side2);}


public Rectc () {}
public Rectc (int s1, int s2) {this.quad= new Quadc(s1,s2,s1,s2);
	}
}
