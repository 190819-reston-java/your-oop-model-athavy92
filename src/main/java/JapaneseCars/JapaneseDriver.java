package JapaneseCars;

public class JapaneseDriver {

	public static void main(String[] args) {
		
		new Honda("Civic", "black", 4, true);
		new Honda("Accord", "black", 4, true);
		new Nissan("350Z", "red", 2, true);
		new Toyota("Supra", "black", 2, true);

		System.out.println(Nissan.inventory);
		System.out.println("There are: " + Nissan.inventory +
				" Nissan ");
		
		System.out.println(Honda.inventory);
		System.out.println("There are: " + Honda.inventory +
				" Honda");
		
		System.out.println(Honda.inventory);
		System.out.println("There are: " + Toyota.inventory +
				" Toyota");
	}
	
}
