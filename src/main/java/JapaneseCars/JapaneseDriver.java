package JapaneseCars;

public class JapaneseDriver {

	public static void main(String[] args) {
		
		Nissan nissan1 = new Nissan("350z", "black", 2);
		Nissan nissan2 = new Nissan("370z", "white", 2);
		
		System.out.println(Nissan.inventory);
		System.out.println("Nissan Inventory: " + Nissan.inventory +" "+ Nissan.getMake() + " "+ Nissan.getModel());
		System.out.println("");
		
		
		System.out.println(Honda.inventory);
		System.out.println("Honda Inventory: " + Honda.inventory +
				" Honda ");
		System.out.println("");
		
		System.out.println(Honda.inventory);
		System.out.println("Toyota Inventory: " + Toyota.inventory +
				" Toyota ");
		System.out.println("");
	}

	private static Honda Honda(String string, String string2, int i, boolean b) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
