
public class Vehicle {
	
	private String vehicleType, vehicleColor;
	public Vehicle () {
		System.out.println("This is the parent class");
	}

	public String getVehicleType(){
		return vehicleType;
	}
	
	public void setVehicleType(String vehicleType) {
		this.vehicleType=vehicleType;
		
	}
	
	public String getvehicleColor() {
		return vehicleColor;
	}
	
	public void setVehicleColor( String vehicleColor) {
		this.vehicleColor=vehicleColor;
	}
}


