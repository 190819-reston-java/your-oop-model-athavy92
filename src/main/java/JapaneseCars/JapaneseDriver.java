package JapaneseCars;

public class JapaneseDriver {

	public static void main(String[] args) {
		
		System.out.println(Nissan.inventory);
		String model = "";
		System.out.println("Nissan Inventory: " + Nissan.inventory +" "+ Nissan.getMake() + " "+ Nissan.getModel(model));
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
