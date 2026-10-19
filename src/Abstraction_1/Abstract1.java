package Abstraction_1;

//without abstraction

class Car{
	
	int no_of_Tyres = 4;
	
	void displayTyres () {
		System.out.println("Car has " + no_of_Tyres + " tyres ");
	}
	
	void start() {
		System.out.println("Car start with a key ignition");
	}
}

class Scooter{
	
	int no_of_Tyres = 2;
	
	void displayTyres() {
		System.out.println("Scooter has " + no_of_Tyres + " tyres ");
	}
	
	void start() {
		System.out.println("Scooter start with a self-start or kick");
	}
}

public class Abstract1 {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		myCar.displayTyres();
		myCar.start();
		
		System.out.println();
		
		Scooter myScooter = new Scooter();
		myScooter.displayTyres();
		myScooter.start();

	}

}