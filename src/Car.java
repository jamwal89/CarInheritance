
public class Car extends Vehicle {
	
	private String carName, carType;
	private int carSpeed;
	
	public Car() {
		System.out.println("This is child class" );
	}
	
	public String getcarName() {
		return carName;
	}
	
	public void setcarName(String carName){
		this.carName= carName;
	}
	
	public int carSpeed () {
		return carSpeed;	
	}
	
	public void carSpeed(int carSpeed) {
		this.carSpeed=carSpeed;
	}
	
	
	public String carPerformance() {
		return carName + carSpeed;
	}
}
