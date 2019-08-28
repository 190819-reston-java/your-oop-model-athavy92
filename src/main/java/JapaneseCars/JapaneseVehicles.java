package JapaneseCars;

public abstract class JapaneseVehicles {
	
	//Fields
	protected String model;
	private String color;
	private int doors;
	
	void bodyType() {
		if (doors > 2) {
			System.out.println("sedan");
		} else {
			System.out.println("coupe");;
		}
	}

	
	//Constructor from fields
	
	public JapaneseVehicles(String model, String color, int doors) {
		super();
		this.model = model;
		this.color = color;
		this.doors = doors;		
	}
	
	public JapaneseVehicles(String model, String color) {
		this(model, color, 4);
	}
	public JapaneseVehicles(String model) {
		this(model, "black");
	}
	public JapaneseVehicles() {
		this("Car Name");
	}
	
	
	//methods
	public void keyless() {
		System.out.println(model + " has keyless start");
	}
	public void convertible() {
		System.out.println(model + " is convertible");
	}
	
	
	//Getters and setters
	//public static String getModel() {
	//	return model;
	//}
	//public void setModel(String model) {
	//	this.model = model;
	//}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getDoors() {
		return doors;
	}
	public void setDoors(int doors) {
		this.doors = doors;
	}

	
	@Override
	public String toString() {
		return "JapaneseVehicles "
				+ "[model=" + model + ", "
				+ "color=" + color + ", "
						+ "doors=" + doors + "]";
	}
	
	
	
	
}
