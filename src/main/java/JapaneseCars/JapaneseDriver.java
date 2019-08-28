package JapaneseCars;

public class JapaneseDriver {

	public static void main(String[] args) {
		
		Nissan nissan1 = new Nissan("350z", "black", 2);
		
		
		System.out.println(Nissan.nissanCount);
		System.out.println("Nissan Inventory: " + Nissan.nissanCount + " Nissan ");
		System.out.println(""); 
		
		
		System.out.println(Honda.hondaCount);
		System.out.println("Honda Inventory: " + Honda.hondaCount +
				" Honda ");
		System.out.println("");
		
		System.out.println(Toyota.toyotaCount);
		System.out.println("Toyota Inventory: " + Toyota.toyotaCount +
				" Toyota ");
		System.out.println("");
	}



	
}
