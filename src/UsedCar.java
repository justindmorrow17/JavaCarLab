
public class UsedCar extends Car {

	private double mileage;
	private String make;
	private String model;
	private int year;
	private double price;
	private String used = "(Used)";

	// no arguments constructor
	public UsedCar() {
	}

	// overloaded constructor
	public UsedCar(String make, String model, int year, double price, String used, double mileage) {
			
			this.make = make;
			this.model = model;
			setYear(year);
			this.price = price;
			this.used = used;
			this.mileage = mileage;
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
		public double getMileage() {
			return mileage;
		}
		public String getUsed() {
			return used;
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
		
		public void setMileage(double mileage) {
			this.mileage = mileage;
		}
		public void setUsed(String used) {
			this.used = used;
		}

		@Override
		public String toString() {
			return this.make + " " + this.model + " " + Integer.toString(year) + " " + "$" + Double.toString(price) + used + mileage +".";
			}
			
	}


