import java.util.*;

public class UsedCarApp {

	public static void main(String[] args) {
		
		String used = "(Used)";
		int selectCar;

		Scanner scan = new Scanner(System.in);

		ArrayList<String> inventoryCars = new ArrayList<>();
		inventoryCars.add("Ford" + " Mustang" + " 2019" + " $48,000");
		inventoryCars.add("Honda" + " HR-V" + " 2019" + " $24,000");
		inventoryCars.add("Porsche" + " 911" + " 2019" + " $108,000");
		inventoryCars.add("Ford" + " Mustang" + " 2012" + " $15,000" + used + " 25,000 miles");
		inventoryCars.add("Pontiac" + " Vibe" + " 2002" + " $4,000" + used + " 125,000 miles");
		inventoryCars.add("Audi" + " TT" + " 2017" + " $30,000" + used + " 18,000 miles");
		
		System.out.println("Select a car from the listed options:");
		
		while (inventoryCars.size() > 0) {
			
			int i = 0;
			for (i = 0; i < inventoryCars.size(); i++) {
				
				System.out.println((i + 1) + ". ");
				System.out.println(inventoryCars.get(i));
			}
			System.out.println((i + 1) + ". Quit\n"); //adding option to quit
			
			System.out.println("Which car would you like?");
			selectCar = scan.nextInt();
			scan.nextLine();

			if (selectCar == (i+1)) {
				
				System.out.println("Good-bye!");
				break;
				
			} else {
				
				System.out.println(inventoryCars.get(selectCar - 1));
				System.out.println("Would you like to buy this car? (y/n)");
				String buyCar = scan.nextLine();
				
				if (buyCar.equalsIgnoreCase("y")) {
					
					System.out.println("Excellent our finance department will be in touch shortly.");
					System.out.println();
					inventoryCars.remove(i-1);
					System.out.println(inventoryCars);
				}
				
				
			}
		}
		scan.close();
	} 
	
}
//			System.out.printf("%10s %10s %10d %10d\n", newCar);
			
	
		
		
 

	


