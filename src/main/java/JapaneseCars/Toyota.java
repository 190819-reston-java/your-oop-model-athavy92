package JapaneseCars;

public class Toyota extends JapaneseVehicles implements StartCar{

	private static String make = "Toyota";
	public static int inventory = 0;

	public Toyota(String model, String color, int doors) {
		super(model, color, doors);
		inventory++;
	}

	public void start() {

	}

	public void stop() {

	}

}
