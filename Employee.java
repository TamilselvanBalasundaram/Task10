package task10;

public class Employee {
	
	int id;
	String firstName;
	String lastName;
	int salary;

	public Employee(int id , String firstName, String lastName , int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	public void raiseSalary(int percentage) {
		salary = salary + (salary * percentage / 100);
		System.out.println("SALARY RAISE - " + salary);
	}
	
}
