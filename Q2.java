package javainheritanceassignment;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee f1 = new Employee("Marty", 20, 3556141, "Takoradi", 20000, "Engineer");
Manager m1 = new Manager("Ramsey", 30, 2334673, "Takoradi", 50000, "Transport");
f1.display();
m1.display();
}
}


class Member {
	String Name;
	int Age;
	int Phonenumber;
	String Address;
	int Salary;

	Member (String Name, int Age, int Phonenumber, String Address, int Salary){
		this.Name = Name;
		this.Age = Age;
		this.Phonenumber = Phonenumber;
		this.Address = Address;
		this.Salary = Salary;
}

void printSalary () {
	System.out.println("Salary: ");
}
}

class Employee extends Member {
	String specialisation;
	
	Employee (String Name, int Age, int Phonenumber, String Address, int Salary,String specialisation) {
		super(Name, Age, Phonenumber, Address, Salary);
		this.specialisation = specialisation;
	}
void display() {
	System.out.println("Employee :" + " " + Name + " " + Age + " " + Phonenumber + " " +  Address + " " + Salary + " " + specialisation);	
	}
}

class Manager extends Member {
	String department;
	
	Manager (String Name, int Age, int Phonenumber, String Address, int Salary, String department) {
		super(Name, Age, Phonenumber, Address, Salary);
		this.department = department;
}
	void display() {
		System.out.println("Manager :" + " " + Name + " " + " " + Age + " " + Phonenumber + " " + Address + " " + Salary + " " + department);
	}
}


