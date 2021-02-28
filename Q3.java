package javainheritanceassignment;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rectangle r1 = new Rectangle(8,4);
Square s = new Square(4);
r1.Area();
s.Area();
r1.Perimeter();
s.Perimeter();
}
}

class Rectangle {
	int length;
	int breath;
	
	Rectangle (int length, int breath) {
		this.length = length;
		this.breath = breath;
	}
	
	void Area() {
		
		System.out.println("Area of rectangle: " + length*breath);	
	}
	void Perimeter() {
		System.out.println("Perimeter of rectangle: " + " " + 2 * (length + breath));
	}
}

class Square extends Rectangle {
	int s;
Square (int s) {
	super (s,s);
	this.s = length;
}
	void Area() {
	System.out.println("Area of Square: " + length*length);	
	}
	void Perimeter() {
		System.out.println("Perimeter of rectangle: " + " " + 4 * (length));
	}
}

