package task10;

public class HerbalTea extends Tea {

	public HerbalTea() {
		super("Herbal Tea");
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HerbalTea obj = new HerbalTea();
		obj.prepareTea();

	}

	public void prepareTea() {
		System.out.println("Ingredients - Flavoured herbs like barks or berries,Fresh spring water, Sugar");
		System.out.println("Brewing time is atleast 5 minutes");
	}
}
