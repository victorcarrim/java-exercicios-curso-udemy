package entities;

public class Rectangle {
	private double width;
	private double hieght;
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setHieght(double hieght) {
		this.hieght = hieght;
	}
	
	public double area() {
		return this.width * this.hieght;
	}
	
	public double perimeter() {
		return 2 * (this.hieght + this.width);
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(hieght, 2));
	}
}
