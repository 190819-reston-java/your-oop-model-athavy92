package JapaneseCars;

import java.io.Serializable;

public abstract class JapaneseVehicles {
	
	//Fields
	private static String model;
	private String color;
	private boolean fourWheels;
	private int doors;
	private Object motorcyle;
	
	
	//Constructor from fields
	public JapaneseVehicles(String model, String color, int doors, boolean fourWheels) {
		super();
		this.model = model;
		this.color = color;
		this.doors = doors;
		this.fourWheels = fourWheels;	
	}
	
	
	//methods
	public void keyless() {
		System.out.println(this.model + " has keyless start");
	}
	public void convertible() {
		System.out.println(this.model + " is convertible");
	}
	
	public String bike() {
		if (fourWheels != true) {
			return "2 wheels";
		}
		return "This is a bike";
	}
	
	//Getters and setters
	public static String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


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


	public boolean isFourWheels() {
		return fourWheels;
	}


	public void setFourWheels(boolean fourWheels) {
		this.fourWheels = fourWheels;
	}



	
	@Override
	public String toString() {
		return "JapaneseVehicles [model=" + model + ", color=" + color + ", doors=" + doors + ", fourWheels="
				+ fourWheels + "]";
	}

	
	

	

	
	
	
	
	
}
