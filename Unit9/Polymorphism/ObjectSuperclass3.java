import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
	
		Vehicle v = new Car("Chevy", "Impala", 4);
		Vehicle v2 = new SportsCar(210, "Ferrari", "Berlinetta", 2);

		ArrayList<Vehicle> vList = new ArrayList<Vehicle>();
		vList.add(new Vehicle()); // Super
		vList.add(v);  						// Sub
		vList.add(v2); 						// Sub-Sub
		

		// Becasue toString is defined in Vehicle we can call it
		// from any class that extends Vehicle, however because
		// Car and Sports car Override the method, we get different
		// behaviors. Pay close attention to differences in the output.
		for (Vehicle vehicle : vList){
			System.out.println("\n----\n" + vehicle);
		}
  }
}


public class SportsCar extends Car {
	private double topSpeed;

	public SportsCar() {
		this(0,"","",0);
	}
	public SportsCar (double topSpeed, String make, String model, int maxPassengers) {
		super(make, model, maxPassengers);
		this.topSpeed = topSpeed;
	}

	public double getTopSpeed() {
		return topSpeed;
	}

	public String toString() {
		return super.toString() + "\n" +
						"Top Speed: " + getTopSpeed();
	}
}



public class Vehicle {

	private int maxPassengers;

	public Vehicle() {
		this(0);
	}

	public Vehicle (int maxPassengers) {
	
		this.maxPassengers = maxPassengers;
	}

	public int getMaxPassengers() {
		return maxPassengers;
	}
	public String toString() {
		return "Maximum Passengers: " + maxPassengers;
	}
}


class SuperClass {
	private int data1;
	private int data2;

	public SuperClass () {
		this(1,2);
	}
	public SuperClass( int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	public String getData() {
		return "Data1: " + data1 + "\nData2: " + data2;
	}

}

class SubClass extends SuperClass {
	
}

class Main {
  public static void main(String[] args) {
    SubClass sub = new SubClass();
	System.out.print(sub.getData());

	//SubClass sub2 = new SubClass(3,4);
		
  }
}
