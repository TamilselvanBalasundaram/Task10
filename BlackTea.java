package task10;

public class BlackTea extends Tea{

	public BlackTea() {
		super("Black Tea");
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BlackTea obt = new BlackTea();
		obt.prepareTea();
	
	}
	
	public void prepareTea() {
		System.out.println("Ingredients - Tea leaves, Hot water, Required sugar");
		System.out.println("Brewing time is 3 to 5 minutes");
	}

}
