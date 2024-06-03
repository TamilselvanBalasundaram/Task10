package task10;

public class EmployeeImp extends Employee {

	public EmployeeImp(int id,String firstName, String lastName, int salary) {
		super(id, firstName, lastName, salary);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeImp obj = new EmployeeImp(4561 , "Robert Downey" , " Jr" , 50000);
		
		obj.getID();
		obj.getFirstName();
		obj.getLastName();
		obj.getName();
		obj.getSalary();
		obj.setSalary(60000);
		obj.getSalary();
		obj.getAnnualSalary();
		obj.raiseSalary(20);
		obj.toString();
	
	}
	
	public int getID() {
		System.out.println("ID - " + id);
		return id;
	}
	
	public String getFirstName() {
		System.out.println("FIRST NAME - " + firstName);
		return firstName;
	}
	
	public String getLastName() {
		System.out.println("LAST NAME - " + lastName);
		return lastName;
	}
	
	public String getName() {
		System.out.println("FULL NAME - " + firstName + " " + lastName);
		return ("FULL NAME - " + firstName + " " + lastName);
	}
	
	public int getSalary() {
		System.out.println("MONTHLY SALARY - " + salary);
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getAnnualSalary() {
		System.out.println("ANNUAL SALARY - " + salary*12);
		return salary;
	}
	
	public String toString() {
		System.out.println(id + " : " + firstName + lastName + " : " + salary);
		return (id + " : " + firstName + lastName + " : " + salary);
	}
	
}
