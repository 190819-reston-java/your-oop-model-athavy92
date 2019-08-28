package JapaneseCars;


public class Nissan extends JapaneseVehicles implements StartCar {
	
	private static String make = "Nissan";
	protected static int nissanCount = 0;
	static String getModel(String model) {
		return model;
	}
	
	public Nissan(String model, String color, int doors) {
		super(model, color, doors);
		this.getModel(model);
		this.getDoors();
		nissanCount++;
	}
	
	

	public static void nissanInventory() {
		System.out.println("There are " + nissanCount + " Nissan(s) on hand");
	}
	
	//Methods
	public void start() {
		System.out.println(Nissan.getModel(model) + " has started ignition");
	}
	public void stop() {
		System.out.println(Nissan.getModel(model) + " has turned off");
	}
	
	@Override
	public void keyless() {
		System.out.println("This car has keyless entry");
	}
	public void convertible() {
		System.out.println("This car is convertible");
	}
	

	//public static String getMake() {
	//	return make;
	//}

	//public static String getModel() {
	//	return model;
	//}



}
