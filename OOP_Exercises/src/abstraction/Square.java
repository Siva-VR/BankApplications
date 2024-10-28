package abstraction;

public class Square extends Rectangle{
	public Square(){}
	public Square(double side){
	super.setLength(side);
	}
	public Square(double side,String color,boolean filled) {
		super.setColor(color);
		super.setFilled(filled);
		super.setLength(side);
	}
	public double getSide() {
		return super.getLength();
	}
	public void setSide(double side) {
		super.setLength(side);
	}
	
	public void setwidth(double side) {
		super.setWidth(side);
	}
	public void setLenth(double side) {
		super.setLength(side);
	}
	@Override
	public String toString() {
		return "Square ["+super.toString()+"]";
	}
	
}
