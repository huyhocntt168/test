package Exe5;

public class Circle implements Shape {
	int diameter;

	@Override
	public double getPerimeter() {
		double perimeter = 2 * Math.PI * (diameter / 2);
		return perimeter;
	}

	@Override
	public double getArea() {
		double area = Math.PI * Math.pow(diameter / 2, 2);
		return area;
	}
	
	public Circle(int diameter) {
		this.diameter = diameter;
	}
	
	public static void main(String[] args) {
		Shape circle = new Circle(10);
		System.out.println(circle.getArea());
		System.out.println(circle.getPerimeter());
	}
}
