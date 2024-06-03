package task10;

public class Person {
	
	int age;
	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person P = new Person();
		Person P1 = new Person(25,"Holland");
		
		P.disp();
		P1.disp();
		
		P.setter(30);
		System.out.println(P.getter());
		
		P.setter1("Chris");
		System.out.println(P.getter1());

	}
	public Person() {
		age = 20;
		name = "Tom";
		System.out.println("Constructor - 1");
	}
	
	public Person(int a , String n) {
		age = a;
		name = n;
		System.out.println("Constructor - 2");
		
	}
	
	public void disp() {
		System.out.println("Age - "+ age +":"+ "Name - "+ name);
		
	}
	public int getter() {
		return age;
	}
	public void setter(int age) {
		this.age = age;
	}
	public String getter1() {
		return name;
	}
	public void setter1(String name) {
		this.name = name;
	}

}
