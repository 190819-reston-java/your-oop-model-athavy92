package JapaneseCars;

public class Toyota extends JapaneseVehicles implements StartCar{

	public static String make = "Toyota";
	public static int inventory = 0;

	public Toyota(String model, String color, int doors, boolean fourWheels) {
		super(model, color, doors, fourWheels);
		inventory++;
	}

	public void start() {

	}

	public void stop() {

	}

}
