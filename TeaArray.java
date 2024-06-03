package task10;

public class TeaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tea teaarray[] = new Tea[3];
		
		teaarray[0] = new BlackTea();
		teaarray[1] = new GreenTea();
		teaarray[2] = new HerbalTea();
		
		for(Tea tea : teaarray) {
			tea.prepareTea();
		}
	}

}
