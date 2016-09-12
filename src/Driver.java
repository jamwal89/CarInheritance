
public class Driver extends Person{
		private String driverCar;
		
		public Driver(){
		
	}
		public Driver(String name, String address) {
		super("Bob", "Rockville");
		
		
	
	
	}
		
		public String getdriveCar(){
			return driverCar;
		}
		
		public void setdriveCar(String driveCar){
			this.driverCar=driverCar;
			
		}
		public String Display() {
			return getName() + " from " +getaddress() +" drives a ";
		}
}
