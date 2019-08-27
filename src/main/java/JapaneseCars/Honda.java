package JapaneseCars;

public class Honda extends JapaneseVehicles implements StartCar {
	
	public static String make = "Honda";
	public static int inventory = 0;

	public Honda(String model, String color, boolean fourWheels, int doors) {
		super(model, color, doors, fourWheels);
		inventory++;
	}
	
	
	//Inventory count
	public static void printInventory() {
		if (inventory == 0) {
			System.out.println("No inventory available");
		} else {
			System.out.println("There are: " + inventory + " Honda " + getModel());
		}
	}

	//Methods
	public void start() {
		System.out.println(this.getModel() + " has started ignition");
	}
	public void stop() {
		System.out.println(this.getModel() + " has turned off");
	}

}
