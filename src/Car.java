
public class Car extends Vehicle {
	
	private String carName, carType, name;
	private int carSpeed;
	
	private Driver dr;
	private Person per;
	
	public Car() {
		dr= new Driver("name", "address");
		
		
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
	
	
	
	public String View() {
		return dr.Display() + carName;
	}
	
}
