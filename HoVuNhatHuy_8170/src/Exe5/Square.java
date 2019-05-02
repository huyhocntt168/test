package Exe5;

public class Square implements Shape {
	int height;

	@Override
	public double getPerimeter() {
		double perimeter = height * 4;
		return perimeter;
	}

	@Override
	public double getArea() {
		double area = height * height;
		return area;
	}

	public Square(int height) {
		this.height = height;
	}
	
	public static void main(String[] args) {
		Shape square = new Square(5);
		System.out.println(square.getArea());
		System.out.println(square.getPerimeter());
	}

}