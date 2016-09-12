
public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car=new Car();
		Car abc= new Car();
		car.setVehicleType("Car");
		abc.setVehicleColor("Sports Car");
		System.out.println("This is a "+ car.getVehicleType());
		System.out.println("This is a " + abc.getVehicleType());
		car.setVehicleColor("Red");
		abc.setVehicleColor("Blue");
		System.out.println("This is a "+ car.getvehicleColor() + " car");
		System.out.println("This is a "+ abc.getvehicleColor() + " car");
		car.setcarName("Porche");
		abc.setcarName("Benz");
		System.out.println(car.getvehicleColor()+ " " + car.getcarName()+" is starting");
		System.out.println(abc.getvehicleColor()+ " " + abc.getcarName()+" is starting");
		car.carSpeed(90);
		abc.carSpeed(120);
		System.out.println(car.getvehicleColor()+ "  " + car.getcarName() + " is moving at " +car.carSpeed()+ "mph");
		System.out.println(abc.getvehicleColor()+ "  " + abc.getcarName() + " is moving at " +abc.carSpeed()+ "mph");
		System.out.println(car.getvehicleColor()+ "  " + car.getcarName() + " is stopped");
		System.out.println(abc.getvehicleColor()+ "  " + abc.getcarName() + " is stopped");
		
		
		
	}
}