package Interfaces;

public class ResizableCircle extends Circle implements Resizable{
	public ResizableCircle(double radius) {
		super(radius);
	}
	public String tostring() {
		return "Resizable["+super.toString()+"]";
	}
	public void resize(int percent) {
		setRadius(getRadius()*percent/100); 

	}
}
