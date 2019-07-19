import java.util.*;

public class CarApp {

	public static void main(String[] args) {
		boolean quit = false;
		String toQuit;
		String make, model;
		int year = 0;
		double price = 0.00;
		int amtCars = 0;
		Scanner scan = new Scanner(System.in);

		while (!quit) {
			System.out.println("Welcome to the Grand Circus Motors admin console!");
			System.out.println("How many cars are you entering?");
			

			amtCars = scan.nextInt();
			scan.nextLine();
			ArrayList<Car> carsList = new ArrayList<>();

			for (int i = 0; i < amtCars; i++) {
				System.out.println("Enter Car #" + (i+1) + "" + " Make: ");
				make = scan.next();
				System.out.println("Enter Car #" + (i+1) + "" + " Model: ");
				model = scan.next();
				System.out.println("Enter Car #" + (i+1) + "" + " Year: ");
				year = scan.nextInt();
				System.out.println("Enter Car #" + (i+1) + "" + " Price: ");
				price = scan.nextDouble();
				scan.nextLine();
				
				// assign data to arrayList
				carsList.add(new Car(make, model, year, price));
			}

			System.out.println("Here's the current inventory:");
			System.out.println(carsList.toString());
			
			System.out.println("Press 'Q' to quit or any key to continue.");
			toQuit = scan.next();
			if (toQuit.equalsIgnoreCase("Q"))
				quit = true;
		}
		scan.close();

		System.out.println("Good Bye!");

	}

}

//carInventory[] carArray; // declaring an array
// carArray = new Car[amtCars]; // allocating an array of a number of cars
//System.out.print("\t Make" + "\t\t Model" + "\t\t\t Year" + "\t\t\t Price" +"\n");
//System.out.println("\t ====" + "\t\t =====" + "\t\t\t ====" + "\t\t\t =====" +"\n");
