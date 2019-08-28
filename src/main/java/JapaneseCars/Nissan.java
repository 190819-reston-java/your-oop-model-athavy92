package JapaneseCars;

public class Nissan extends JapaneseVehicles implements StartCar {
	
	public static String make = "Nissan";
	public static int inventory = 0;
	
	public Nissan(String model, String color, int doors) {
		super(model, color, doors);
		Nissan.getModel(model);
		this.getDoors();
		inventory++;
	}
	

	//Methods
	public void start() {
		System.out.println(Nissan.getModel(null) + " has started ignition");
	}
	public void stop() {
		System.out.println(Nissan.getModel(null) + " has turned off");
	}


	public static String getMake() {
		return make;
	}
	public static void setMake(String make) {
		Nissan.make = make;
	}
	public static String getModel(String model) {
		return model;
	}

}
