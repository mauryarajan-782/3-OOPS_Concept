package Abstraction_1;

//using Abstract

abstract class Vehicle{
	
	int no_of_Tyres;
	
	void displayTyres () {
		System.out.println("Vehicle has " + no_of_Tyres + " tyres ");
	}
	
	abstract void start();
}

class Truck extends Vehicle{
	
	Truck()  {
		no_of_Tyres = 4;
	}
	
	void start() {
		System.out.println("Truck start with a key ignition");
	}
}

class Bike extends Vehicle{
	
	Bike() {
		no_of_Tyres = 2;
	}
		
	void start() {
		System.out.println("Bike start with a self-start or kick");
	}
}

public class Abstract2 {

	public static void main(String[] args) {
		
		Vehicle Vehicle1 = new Truck();
		Vehicle1.displayTyres();
		Vehicle1.start();
		
		System.out.println();
		
		Vehicle Vehicle2 = new Bike();
		Vehicle2.displayTyres();
		Vehicle2.start();

	}

}