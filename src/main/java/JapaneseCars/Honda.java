package JapaneseCars;

public class Honda extends JapaneseVehicles implements StartCar {
	
	private static String make = "Honda";
	protected static int hondaCount = 0;

	public Honda(String model, String color, int doors) {
		super(model, color, doors);
		Honda.getModel(model);
		hondaCount++;
	}
	
	
	private static String getModel(String model) {
		return model;
	}


	//Inventory count
	public void hondaInventory() {
		if (hondaCount == 0) {
			System.out.println("No inventory available");
		} else {
			System.out.println("There are: " + hondaCount + " Honda ");
		}
	}
	

	//Methods
	public void start() {
		System.out.println(Honda.getModel(model) + " has started ignition");
	}
	public void stop() {
		System.out.println(Honda.getModel(model) + " has turned off");
	}

}
