package JapaneseCars;

public class Nissan extends JapaneseVehicles implements StartCar {
	
	private static String make = "Nissan";
	public static int inventory = 0;

	public Nissan(String model, String color, int doors) {
		super(model, color, doors);
		inventory++;
	}
	

	//Methods
	public void start() {
		System.out.println(JapaneseVehicles.getModel() + " has started ignition");
	}
	public void stop() {
		System.out.println(JapaneseVehicles.getModel() + " has turned off");
	}

}
