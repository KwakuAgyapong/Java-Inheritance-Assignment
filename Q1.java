package javainheritanceassignment;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Method s = new Method();
Method1 c = new Method1();

s.display();
c.display1();
c.display();
	}
}

class Method {
Method () {
	System.out.println("This is parent class");
}

public void display() {
	System.out.println("Method of parent class called");
}	
}

class Method1 extends Method {
	Method1 () {
	System.out.println("This is child class");
}
public void display1() {
	System.out.println("Method of child class called");
}
}