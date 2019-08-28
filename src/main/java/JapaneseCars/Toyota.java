package JapaneseCars;


public class Toyota extends JapaneseVehicles implements StartCar {
	
	public static String make = "Toyota";
	
	public static int toyotaCount = 0;
	
	public Toyota(String model, String color, int doors) {
		super(model, color, doors);
		Toyota.getModel(model);
		this.getDoors();
		toyotaCount++;
	}

	private static String getModel(String model) {
		return model;
	}

	public void start() {
		System.out.println(Toyota.getModel(model) + " has started ignition");
	}
	public void stop() {
		System.out.println(Toyota.getModel(model) + " has turned off");
	}



}
