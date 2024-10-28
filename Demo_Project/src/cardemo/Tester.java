package cardemo;

class Car{
	double mileage;
	double fuel;
	double distance;
	Car(double mlg,double fl,double dis){
		this.mileage = mlg;
		this.fuel = fl;
		this.distance = dis;
	}
	public double distanceTravelled() {
		return mileage*fuel;
	}
	public boolean isGoodCondition() {
		double actualdis = distanceTravelled();
		if(actualdis >=distance) {
			return true;
		}
		return false; 
	}
	
}
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c1 = new Car(30,13.5,500);
		System.out.println("Distance travelled by the car "+c1.distanceTravelled());
		if(c1.isGoodCondition()) {
			System.out.println("Car is good condition");
		}
		else {
			System.out.println("Car is not good condition");
		}
		
	}

}
