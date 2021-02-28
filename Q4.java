package javainheritanceassignment;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle1 r1 = new Rectangle1(8,4);
		r1.Area();
		r1.Perimeter();
		
		Square1 s = new Square1(4);
		s.Area();
		s.Perimeter();
		
	Square1 [] s1 = new Square1[10];
	int z = 5;
	for (int i = 0; i < 10; i++) {
		s1[i] = new Square1(z);
		z++;
		s1[i].Area();
	}
	for (int i = 0; i < 10; i++) {
		s1[i].Area();
		s1[i].Perimeter();
		
	}
	}
		}

		class Rectangle1 {
			int length;
			int breath;
			
			Rectangle1 (int length, int breath) {
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

		class Square1 extends Rectangle {
			int s;
		Square1 (int s) {
			super (s,s);
			this.s = length;
		}
		}

