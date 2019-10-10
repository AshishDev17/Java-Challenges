
public class AreaCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(AreaCalculator.area(5.0));
		System.out.println(AreaCalculator.area(-1));
		System.out.println(AreaCalculator.area(5.0, 4.0));
		System.out.println(AreaCalculator.area(-1.0, 4.0));
	}
	
	public static final double PI = 3.14159;
	
	public static double area(double radius) {
		if(radius < 0) {
			return -1;
		}
		
		double area = PI * radius * radius;
		
		return area;
	}
	
	public static double area(double length, double breadth) {
		if(length < 0 || breadth < 0) {
			return -1;
		}
		
		double area = length * breadth;
		
		return area;
	}

}
