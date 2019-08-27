package JapaneseCars;

public class Honda extends JapaneseVehicles implements StartCar {
	
	private static String make = "Honda";
	public static int inventory = 0;

	public Honda(String model, String color, int doors, boolean fourWheels) {
		super(model, color, doors, fourWheels);
		inventory++;
	}
	
	
	//Inventory count
	public void hondaInventory() {
		if (inventory == 0) {
			System.out.println("No inventory available");
		} else {
			System.out.println("There are: " + inventory + " Honda " + model);
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
