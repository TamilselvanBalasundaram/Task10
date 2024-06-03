package task10;

public class Circle {
	
	int radius;
	double answer,pi;
	
	public Circle() {
		radius = 10;
		pi = 3.14;
	}
	
	public Circle(int r , double p) {
		radius = r;
		pi = p;
	}
	
	public void circumference() {
		answer = 2 * pi * radius;
		System.out.println("Circumference of the circle is " + answer);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle C = new Circle();
		C.circumference();
		
		Circle C1 = new Circle(25 , 3.14);
		C1.circumference();

	}

}
