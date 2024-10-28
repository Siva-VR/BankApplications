package classes;

public class Circle {
	double radius;
	String color;
	public Circle() {
		radius = 1.0;
		color = "red";
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	public Circle(double radius,String color) {
		this.radius = radius;
		this.color = color;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public double getArea()
	{
		return Math.PI*radius*radius;
	}
	
	public double getCircumference() {
		return 2*Math.PI*radius;
	}
	public String toString() {
		return "Circle["+radius+"]";
	}
}