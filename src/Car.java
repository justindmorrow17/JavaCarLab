import java.util.*;

public class Car {
	
	//initializing your variables
	private String make;
	private String model;
	private int year;
	private double price;
	Scanner scan = new Scanner(System.in);
	
	//no arguments constructor
	public Car() {		
	}
	
	// constructor
	public Car(String make, String model, int year, double price) {
		
		this.make = make;
		this.model = model;
		setYear(year);
		this.price = price;		
	}

	//get methods	
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
 	
	public double getPrice() {
		return price;
	}
	
	//set methods
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setYear(int year) {
		while (year < 1900 || year > 2019) {
			System.out.println("Please enter valid year.");
			year = scan.nextInt();
		}
		this.year = year;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public String toString() {
		return "Make: " + make + "\tModel: " + model + "\tYear: " + year + "\tPrice: " + price;
		}
		
}
