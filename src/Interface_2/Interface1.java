package Interface_2;

interface I1{
	void start();
	void stop();
}

class Car implements I1{
	public void start() {
		System.out.println("Car is startinng...");
	}
	
	public void stop() {
		System.out.println("Car is stoping...");
	}
	
}

public class Interface1 {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.start();
		car.stop();

	}

}
