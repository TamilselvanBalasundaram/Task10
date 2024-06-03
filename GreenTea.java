package task10;

public class GreenTea extends Tea{

	public GreenTea() {
		super("Green Tea");
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GreenTea Obj = new GreenTea();
		Obj.prepareTea();

	}
	
	public void prepareTea() {
		System.out.println("Ingredients - Polyphenols, Theanine, Caffeine, Ginger, Lemon, Honey");
		System.out.println("Brewing time is about 2 minutes");
	}

}
