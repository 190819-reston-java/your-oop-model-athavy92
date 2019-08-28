package JapaneseCars;

import java.util.ArrayList;
import java.util.List;

public class VehicleInventory {

	public static void main(String[] args) {
		inventoryList();
	}

	public static void inventoryList() {
		ArrayList<Nissan> nissanCars = new ArrayList<Nissan>();
		nissanCars.add(new Nissan("350z", "black", 2));
		nissanCars.add(new Nissan("370z", "white", 2));
		nissanCars.add(new Nissan("350z", "green", 2));
		
		
		System.out.println(nissanCars);
	}
	

}
