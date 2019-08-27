package JapaneseCars;

public class JapaneseDriver {

	protected static String model;

	public static void main(String[] args) {
		

		System.out.println(Nissan.inventory);
		System.out.println("Nissan Inventory: " + Nissan.inventory +
				" Nissan ");
		System.out.println("");
		
		
		System.out.println(Honda.inventory);
		System.out.println("Honda Inventory: " + Honda.inventory +
				" Honda " + Honda.model);
		System.out.println("");
		
		System.out.println(Honda.inventory);
		System.out.println("Toyota Inventory: " + Toyota.inventory +
				" Toyota " + Toyota.model);
		System.out.println("");
	}

	
}
