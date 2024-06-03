package task10;

public class Tea {
	
	String name;

	public Tea(String name) {
		this.name = name;
	}
	
	public void prepareTea() {
		String H = "Hot Water + ";
		System.out.println(H.concat("Tea leaves"));
		System.out.println("To make the basic tea,take 1 glass of water and add tea leaves and boil");
	}
	
	public void addMilk() {
		String I = "basic tea + ";
		System.out.println(I.concat("Milk"));
		System.out.println("After boiling, add two glass of milk to it");
	}
	
	public void addSugar() {
		String J = "basic tea + milk + ";
		System.out.println(J.concat("Sugar"));
		System.out.println("After added milk, add the required amount of sugar to it");
		
	}
}
